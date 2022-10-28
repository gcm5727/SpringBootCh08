package com.rubypaper.board.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{
	
	@Autowired
	MemberDao dao;
	
	@Override
	public void insert(MemberVo vo) {
		dao.insert(vo);
	}
	
	@Override
	public void delete(MemberVo vo) {
		dao.delete(vo);
	}


	@Override
	public void update(MemberVo vo) {
		dao.update(vo);
	}

	@Override
	public List<MemberVo> getMemberList(MemberVo vo) {
		return dao.getMemberList(vo);
	}

	@Override
	public MemberVo getMember(MemberVo vo) {
		return dao.getMember(vo);
	}

}
