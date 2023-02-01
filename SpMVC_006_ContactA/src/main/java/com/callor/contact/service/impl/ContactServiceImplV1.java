package com.callor.contact.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.callor.contact.models.ContactDto;
import com.callor.contact.pesistence.ContactDao;
import com.callor.contact.service.ContactService;

/**
 * spring project 에서 Bean에 대하여
 * 
 *  spring project 는 project 가 start 될때
 *  @Component(@Controller,@Service,@Bean) 들이 설정된 class 들을 
 *  scan 하여 객체로 생성한 후 Container 에 보관을 한다
 *  
 *  어디선가 @Autowired 로 설정된 코드가 발견되면
 *  해당 객체를 사용할수 있도록 주입(공급)해준다
 *  
 *  또는
 *  private final 로 설정된 코드가 발견되면
 *  생성자를 통하여 해당 객체를 사용할수 있도록 주입(공급)해준다
 *  
 *  
 *  Container 에 보관중인 객체를 필요한 곳에 주입을 하는데
 *  시점이 매우 중요하다.
 *  
 *  1. private final 로 선언된 코드가 있냐?
 *  	있으면 생성자를 통하여 주입한다
 *  	없으면 생성자를 통한 주입을 포기한다
 *  
 *  2. @Autowired 로 선언언된 코드가 있냐?
 *  	있으면 (여기서는 service) 객체가 만들어졌냐?
 *  		그러면 setter 를 통하여 주입한다
 *  
 *  아래 코드에서 생성자에서 cndDao를 참조하여 method 들을 사용하려면
 *  cndDao 도 생성자에서 초기화가 되어야 한다.
 *  
 *
 */

@Service
public class ContactServiceImplV1 implements ContactService{

	private String[] names ;
	private List<ContactDto> contactList ;
	
	// ContactDao 클래스를 사용하여 만들어진 객체를 사용하고 싶으니
	// 누군가 나에게 주입(공급)해줘!! 라는 외침
	private final ContactDao cntDao;
	public ContactServiceImplV1(ContactDao cntDao) {
		super();
		this.cntDao = cntDao;
		cntDao.create_contact_table();
		cntDao.create_hobby_table();
		names = new String[] {"홍길동","이몽룡","성춘향","장녹수","임꺽정"};
		contactList = new ArrayList<>();
	}
	@Override
	public List<ContactDto> selectALl() {
		contactList.removeAll(contactList);
		Random rnd = new Random();
		for(int i = 0 ; i < 10 ; i++ ) {
			int rndIndex = rnd.nextInt(names.length);
			ContactDto dto = new ContactDto();
			dto.setC_uid(i+1L);
			dto.setC_name(names[rndIndex]);
			contactList.add(dto);
		}
		return contactList;
	}
	@Override
	public ContactDto findById(Long uid) {
		// TODO Auto-generated method stub
		return contactList.get((int)(long)(uid));
	}
	@Override
	public int insert(ContactDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int update(ContactDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
