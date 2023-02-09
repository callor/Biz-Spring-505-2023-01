package com.callor.books.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.books.models.BookDto;
import com.callor.books.service.MyBookService;

@Controller
@RequestMapping(value="/mybook")
public class MyBookController {
	
	private final MyBookService myBookService;
	public MyBookController(MyBookService myBookService) {
		super();
		this.myBookService = myBookService;
	}

	@RequestMapping(value="/list",method=RequestMethod.GET)
	public String list(Model model) {
		List<BookDto> bookList = myBookService.selectAll();
		model.addAttribute("BOOKS",bookList);
		return "books/list";
	}

}
