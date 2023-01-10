package com.callor.user.service;

import com.callor.user.models.UserVO;

public class UserService {
	
	
	/**
	 * UserVO type 의 user 객체에 저장된 데이터를
	 * return 하는 method
	 * 
	 * @return UserVO
	 */
	public UserVO getUser() {
		/**
		 * UserVO type 의 user 객체변수를 선언하고
		 * 객체를 생성(new UserVO()) 하였다
		 * 
		 * 미리 정의된 UserVO 클래스를 사용하여
		 * user 객체를 선언하고, 초기화(생성하기)한다
		 * 
		 * 클래스의 각 속성(변수)에 데이터를 담기 위해서는
		 * 먼즈 클래스를 사용하여 객체를 선언하고
		 * 초기화 과정을 수행해야 한다
		 */
		UserVO user = new UserVO();
		user.setUsername("callor");
		user.setRealname("성춘향");
		user.setNickname("낭낭18세");
		user.setAge(18);
		return user;
	}

}
