package com.callor.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.user.models.BookVO;
import com.callor.user.service.BookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	
	/**
	 * Spring Web Application Service 프로젝트의 핵심기능
	 * 		의존성주입(Dependency Inject), 
	 * 		제어의 역전(Inversion of Control)
	 * 
	 * Spring project 에서 일반적으로 Service 클래스는
	 * 개발자가 객체로 선언하는 코드가 없다
	 * 프로젝트가 시작될때 자동으로 1개의 객체를 생성하고
	 * Container 에 보관하고 있다
	 * 어디선가 객체의 method 를 호출하는 코드가 실행되면
	 * Container 가 자동으로 주입을 한다.
	 * 
	 */
	@Autowired
	private BookService bService;
		
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public String book(Model model) {
		BookVO book = bService.getBook();
		model.addAttribute("BOOK",book);
		return "book/detail";
	}

}
