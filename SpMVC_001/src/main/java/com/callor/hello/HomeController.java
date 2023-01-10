package com.callor.hello;
/*
 * app.use("/user",uerRouter)
 * 
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class HomeController {
	
	/*
	 * http://localhost:8080/hello/user/login 으로 요청이 오면
	 *  /WEB-INF/views/user/login.jsp 를 Rendering 하여 응답하라
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(String username, String password, Model model) {
		
		model.addAttribute("USERNAME", username);
		model.addAttribute("PASSWORD",password);
		return "user/login";
	}

}
