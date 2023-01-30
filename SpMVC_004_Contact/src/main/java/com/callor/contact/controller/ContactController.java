package com.callor.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.callor.contact.service.ContactService;
/**
 * RestController
 * 자체 view 가 없는 api 전용 controller
 * 
 * Controller + ResponseBody 의 조합으로 api Controller 를
 * 설정하는데
 * view 가 필요없는 프로젝트에서는 RestController 설정만으로
 * api 전용 Controller 를 만든다
 * 
 * @author callor
 *
 */
@RestController
@RequestMapping(value="/api")
public class ContactController {
	
	@Autowired
	private ContactService cService; 
	
	@RequestMapping(value="/list")
	public String listAll() {
		cService.findById(null);
		return "This Reponse is List All";
	}
}
