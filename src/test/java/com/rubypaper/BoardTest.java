package com.rubypaper;

import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.rubypaper.board.domain.BoardVo;
import com.rubypaper.board.persistence.BoardServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTest {

	@Autowired
	BoardServiceImpl  service;
	
	@Test
	public  void  insert() {
		for(int i=11; i <=15 ; i++) {
		BoardVo	vo=new BoardVo();
		vo.setTitle("테스터"+i+"입니다.");
		vo.setWriter("member");
		vo.setContent("테스터 내용"+i+"");
		vo.setCreateDate(new Date());
		vo.setCnt(2);
		service.insert(vo);
		}
		
	}
	
	// @Before
	public  void  delete() {
		for (int i=1 ; i <= 10 ; i++ ) {
		BoardVo	vo=new BoardVo();
		vo.setSeq(1001 + i);
		service.delete(vo);
		}
		
	}
	
	//@Test
	public  void  select() {
		
		List<BoardVo> li=service.getBoardList(null);
		
		for(BoardVo m :li) {
		  System.out.println("==>" + m.toString());
		}
	}

	
}