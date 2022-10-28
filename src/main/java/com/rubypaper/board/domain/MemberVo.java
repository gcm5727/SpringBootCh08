package com.rubypaper.board.domain;

import lombok.Data;

@Data
public class MemberVo {
	private String id;
	private String password;
	private String name;
	
	private Role role;
	private String enabled;
}
