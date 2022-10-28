package com.rubypaper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.domain.JoinVo;
import com.rubypaper.board.persistence.JoinServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JoinTest {

	@Autowired
	JoinServiceImpl  service;
	
	
	//@Test
	public  void  join1() {
		List<JoinVo> li = service.join1();
		for(JoinVo m : li) {
		  System.out.println("==>" + m.toString());
		}
	}


	//@Test
	public  void  join2() {
		JoinVo vo = new JoinVo();
		vo.setId("admin");
		List<JoinVo> li = service.join2(vo);
		
		for(JoinVo m : li) {
		  System.out.println("==>" + m.toString());
		}
	}


	//@Test
	public  void  join3() {
		JoinVo vo = new JoinVo();
		vo.setSeq(1001);
		
	}

}