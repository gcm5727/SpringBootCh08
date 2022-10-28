package com.rubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rubypaper.board.domain.JoinVo;

@Mapper
public interface JoinDao {
	List<JoinVo> join1();
	List<JoinVo> join2(JoinVo vo);
	JoinVo join3(JoinVo vo);
	void delete(JoinVo vo);
}
