package com.rubypaper.board.persistence;

import java.util.List;

import com.rubypaper.board.domain.JoinVo;

public interface JoinService {
	List<JoinVo> join1();
	List<JoinVo> join2(JoinVo vo);
	JoinVo join3(JoinVo vo);

	void delete(JoinVo vo);
}
