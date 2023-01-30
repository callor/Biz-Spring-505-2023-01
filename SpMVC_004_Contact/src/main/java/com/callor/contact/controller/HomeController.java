package com.callor.contact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	public HomeController() {		
	}
	
	/**
	 * Controller 의 method 에서
	 * 문자열을 return 하면
	 * views/문자열.jsp 파일을 찾아서 rendering 하여
	 * client에 response 하도록 기본설정이 되어 있다
	 * 이때 method 에 @ResponseBody Annotation 을 설정해 두면
	 * 문자열을 return 했을때 문자열.jsp 파일을 찾지 않고
	 * 문자열 그대로를 client 에 response 한다
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/")
	public String home() {
		return "Good Morning Korea";
	}
}
