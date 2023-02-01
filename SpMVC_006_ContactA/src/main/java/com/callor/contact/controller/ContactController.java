package com.callor.contact.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.callor.contact.service.ContactService;

@RestController
@RequestMapping(value="/api")
public class ContactController {
	
	private final ContactService cntService;
	public ContactController(ContactService cntService) {
		super();
		this.cntService = cntService;
	}

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list() {
		return "Contact List view";
	}
	

}
