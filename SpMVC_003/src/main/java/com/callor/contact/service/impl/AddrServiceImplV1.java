package com.callor.contact.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.callor.contact.config.QualConfig;
import com.callor.contact.models.AddrVO;
import com.callor.contact.service.AddrService;

/**
 * AddrService interface 를 implements 한 class 
 * interface 를 impl 한 클래스는 interface 에 정의된
 * method 들을 반드시 구현해야 한다
 * 
 * interface 를 설계도로 삼아 클래스를 작성하는 것이다
 *
 */
@Service(QualConfig.ADDR.SERVICE_V1)
public class AddrServiceImplV1 implements AddrService{

	@Override
	public List<AddrVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AddrVO findById(String num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(AddrVO addrVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AddrVO addrVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String num) {
		// TODO Auto-generated method stub
		return 0;
	}

}
