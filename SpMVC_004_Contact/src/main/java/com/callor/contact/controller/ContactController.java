package com.callor.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.callor.contact.models.Contact;
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
	
	/**
	 * Controller 에서 사용하는 return type
	 * Controller 는 기본 type 으로 보통 String 만을 사용한다
	 * 숫자, 클래스, 등등의 데이터는 기본적으로
	 * return type 으로 사용할수 없다.
	 * @return
	 */
	@RequestMapping(value="/list/json",
			produces = "application/json;charset=UTF-8")
	public List<Contact> listAllJSON() {
		// Contact result = cService.findById(null);
		// return "This Reponse is List All";
		
		List<Contact> contactList = cService.selectAll();
		return contactList;
	}
	@RequestMapping(value="/list/xml",
			produces = "application/xml;charset=UTF-8")
	public Contact listAllJXML() {
		Contact result = cService.findById(null);
		// return "This Reponse is List All";
		return result;
	}


}
