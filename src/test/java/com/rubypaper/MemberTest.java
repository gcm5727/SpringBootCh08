package com.rubypaper;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.domain.MemberVo;
import com.rubypaper.board.domain.Role;
import com.rubypaper.board.persistence.MemberServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MemberTest {

	@Autowired
	MemberServiceImpl  service;

	@Autowired
	private  PasswordEncoder  encoder;
	
	//@Before
	public  void  insert() {
		MemberVo vo = new MemberVo();
		vo.setId("admin");
		vo.setName("길동");
		vo.setPassword("admin123");
		vo.setRole(Role.ROLE_ADMIN);
		vo.setEnabled("TRUE");
		service.insert(vo);
	}
	
	@Before
	public  void  update() {
		MemberVo	vo = new MemberVo();
		vo.setId("admin");		
		vo.setName("길동");
		vo.setPassword(encoder.encode("admin123"));
		service.update(vo);		
	}
	
	
	
	@Test
	public  void  select() {
		
		List<MemberVo> li=service.getMemberList(null);
		
		for(MemberVo m :li) {
		  System.out.println("==>" + m.toString());
		}
	}
}