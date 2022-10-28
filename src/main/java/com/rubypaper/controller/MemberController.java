package com.rubypaper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rubypaper.board.domain.BoardVo;
import com.rubypaper.board.domain.MemberVo;
import com.rubypaper.board.persistence.BoardServiceImpl;
import com.rubypaper.board.persistence.MemberServiceImpl;

@Controller
public class MemberController {
	
	@Autowired
	private MemberServiceImpl memberService;
	
	@Autowired
	private BoardServiceImpl boardService;
	
	@RequestMapping(value="/board/getMemberList.do")
	public String getMemberList(Model model, MemberVo vo) {
		
		model.addAttribute("li", memberService.getMemberList(vo));
		
		return "/board/getMemberList";
	}

	@RequestMapping(value="/board/getMember.do")
	public String getMember(Model model, MemberVo vo) {
		
		model.addAttribute("m", memberService.getMember(vo));
		
		return "/board/getMember";
	}
	
	
	@RequestMapping(value="/board/updateMember.do")
	public String MemberUpdate(MemberVo vo) {
		
		memberService.update(vo);
		
		return "redirect:/board/getMemberList.do";
	}
	
	
	@RequestMapping(value="/board/deleteMember.do")
	private String deleteMember(MemberVo vo, BoardVo bvo) {
	
		bvo.setWriter(vo.getId());
		boardService.allDelete(bvo);

		memberService.delete(vo);
		
		return "redirect:/board/getMemberList.do";
	}
	
}
