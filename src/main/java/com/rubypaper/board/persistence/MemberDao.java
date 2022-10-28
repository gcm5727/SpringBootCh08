package com.rubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rubypaper.board.domain.MemberVo;

@Mapper
public interface MemberDao {
	void insert(MemberVo vo);
	void delete(MemberVo vo);
	void update(MemberVo vo);
	MemberVo getMember(MemberVo vo);
	List<MemberVo> getMemberList(MemberVo vo);
}
