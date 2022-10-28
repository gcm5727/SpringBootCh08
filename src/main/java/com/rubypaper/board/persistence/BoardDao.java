package com.rubypaper.board.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.rubypaper.board.domain.BoardVo;

@Mapper
public interface BoardDao {
	void insert(BoardVo vo);
	void update(BoardVo vo);
	void delete(BoardVo vo);
	void cnt(BoardVo vo);
	void allDelete(BoardVo vo);
	
	BoardVo getBoard(BoardVo vo);
	List<BoardVo> getBoardList(BoardVo vo);
}
