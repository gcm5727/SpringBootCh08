package com.rubypaper.board.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.JoinVo;

@Service
public class JoinServiceImpl implements JoinService {
	
	@Autowired
	JoinDao dao;
	
	@Override
	public List<JoinVo> join1() {
		return dao.join1();
	}

	@Override
	public List<JoinVo> join2(JoinVo vo) {
		return dao.join2(vo);
	}

	@Override
	public JoinVo join3(JoinVo vo) {
		return dao.join3(vo);
	}

	@Override
	public void delete(JoinVo vo) {
		dao.delete(vo);
	}

}
