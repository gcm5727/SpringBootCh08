package com.rubypaper.board.security;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.rubypaper.board.persistence.MemberDao;
import com.rubypaper.board.domain.MemberVo;

@Service
public class BoardUserDetailsService  implements  UserDetailsService {

	BoardUserDetailsService(){
	 System.out.println("===> BoardUserDetailsService 생성자확인");
	}
	
	@Autowired
	private MemberDao  dao;
	
	//login 정보 이용을 위한 세션 선언
	@Autowired
	private HttpSession session;
	
	@Override
	public UserDetails loadUserByUsername(String username) 
			   throws UsernameNotFoundException {
		
		System.out.println("===> UserDetails loadUserByUsername ");
		
		// login 폼에서 넘어온값 
		MemberVo member = new MemberVo();
		member.setId(username);
	
		MemberVo user = dao.getMember(member);
		
		//login 정보 세트
		session.setAttribute("member", user);
		
		if(user == null) {
			throw  new  UsernameNotFoundException(username + "사용자 없음");
		}else {
			System.out.println(" ===****==> new SecurityUser 로 넘어간다.");
			return new SecurityUser(user);
		}
	}

}