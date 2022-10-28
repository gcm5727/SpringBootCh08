package com.rubypaper.board.domain;

import java.util.Date;

import lombok.Data;

@Data
public class JoinVo {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date createDate;
	private int cnt;
	
	private String id;
	private String password;
	private String name;
	private Role role;
	private String enabled;

	private String ch1;
	private String ch2;
}
