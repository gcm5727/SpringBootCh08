package com.rubypaper.board.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.rubypaper.board.domain.MemberVo;

@SessionAttributes("member")
public class SecurityUser  extends  User {
	
	private static final long serialVersionUID = 1L;

	public SecurityUser( MemberVo member) {
		 
		super(member.getId(), member.getPassword(),
			   AuthorityUtils.createAuthorityList(member.getRole().toString())	);
		
		
		// 데이터베이스 리턴값.
		System.out.println(" ===> SecurityUser 생성자확인 ");
		System.out.println("===> SecurityUser 확인:" + member.getId()  + ":" + member.getPassword() );	
		
	}

}