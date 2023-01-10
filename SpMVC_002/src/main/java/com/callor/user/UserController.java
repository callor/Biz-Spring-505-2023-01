package com.callor.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.callor.user.models.UserVO;
import com.callor.user.service.UserService;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/join",method=RequestMethod.GET)
	public String join() {
		return "user/join";
	}
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVO user,Model model) {
		/**
		 * UserVO 클래스를 작성할때
		 * 모든 변수를 private 으로 선언하고
		 * getter(), setter() method 를 만들었다
		 * java 코드에 변수값을 읽을때는 객체.getter() 형식으로
		 * 사용해야 한다.
		 */
		System.out.println(user.getUsername());
		model.addAttribute("USER",user);
		return "user/join_ok";
	}
	
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String detail(Model model) {

		/**
		 * UserSerivce 클래스에 선언된 getUser() method 를 호출하여
		 * 사용자 정보 받아오기(getter)
		 * 
		 * UserService 클래스에 선언된 getUser() method 를 호출하여
		 * 어떤 일을 시키려면 클래스를 객체로 선언하고,
		 * 초기화 하는 과정을 먼저 수행해야 한다
		 */
		// UserService.getUser() 처럼 사용불가
		UserService uService = new UserService();
		UserVO user = uService.getUser();
		
		model.addAttribute("USER",user);
		return "user/join_ok";
	}
	
	
	
	
	

}
