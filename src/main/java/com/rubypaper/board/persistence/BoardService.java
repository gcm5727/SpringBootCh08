package com.rubypaper.board.persistence;

import java.util.List;

import com.rubypaper.board.domain.BoardVo;

public interface BoardService {
	void insert(BoardVo vo);
	void update(BoardVo vo);
	void delete(BoardVo vo);
	void cnt(BoardVo vo);
	void allDelete(BoardVo vo);
	
	BoardVo getBoard(BoardVo vo);
	List<BoardVo> getBoardList(BoardVo vo);
}
