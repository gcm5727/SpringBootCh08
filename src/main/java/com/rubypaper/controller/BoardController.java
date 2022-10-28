package com.rubypaper.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubypaper.board.domain.BoardVo;
import com.rubypaper.board.domain.JoinVo;
import com.rubypaper.board.persistence.BoardServiceImpl;
import com.rubypaper.board.persistence.JoinServiceImpl;

@RequestMapping("/board/")
@Controller
public class BoardController {

	@Autowired
	BoardServiceImpl  boardService;
	
	@Autowired
	JoinServiceImpl  joinService;
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(Model model, JoinVo  vo){		
		model.addAttribute("li", joinService.join1());		
		return "/board/getBoardList";		
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(Model model, JoinVo  vo, BoardVo bvo){
		JoinVo m = joinService.join3(vo);
		System.out.println(m.toString());
		
		boardService.cnt(bvo);
		model.addAttribute("m", joinService.join3(vo));
		
		return "board/getBoard";
		
	}
	
		
	@RequestMapping("/insertBoardOk.do")
	public String insertBoard(Model model, BoardVo  vo){
		vo.setCreateDate(new Date());
		vo.setCnt(0);
		boardService.insert(vo)	;
		return "redirect:getBoardList.do";		
	}
		
	@RequestMapping("insertBoard.do")
	public String insertBoardForm(Model model, BoardVo  vo){
		
		return "board/insertBoard";		
	}
		
}