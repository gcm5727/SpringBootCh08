package com.rubypaper.board.persistence;

import java.util.List;

import com.rubypaper.board.domain.MemberVo;

public interface MemberService {

	void insert(MemberVo vo);
	void delete(MemberVo vo);
	void update(MemberVo vo);
	MemberVo getMember(MemberVo vo);
	List<MemberVo> getMemberList(MemberVo vo);
}
