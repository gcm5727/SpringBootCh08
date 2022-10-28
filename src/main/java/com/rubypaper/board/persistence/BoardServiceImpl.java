package com.rubypaper.board.persistence;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rubypaper.board.domain.BoardVo;

@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	BoardDao dao;
	
	@Override
	public void insert(BoardVo vo) {
		dao.insert(vo);
	}

	@Override
	public void update(BoardVo vo) {
		dao.update(vo);
	}

	@Override
	public void delete(BoardVo vo) {
		dao.delete(vo);
	}

	@Override
	public BoardVo getBoard(BoardVo vo) {
		return dao.getBoard(vo);
	}

	@Override
	public List<BoardVo> getBoardList(BoardVo vo) {
		return dao.getBoardList(vo);
	}

	@Override
	public void cnt(BoardVo vo) {
		dao.cnt(vo);
	}

	@Override
	public void allDelete(BoardVo vo) {
		dao.allDelete(vo);
	}

}
