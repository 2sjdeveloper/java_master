package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardMapper { // 데이터베이스를 처리하는 인터페이스.
	// 목록, 단건조회, 추가, 수정, 삭제, 조회수 증가(클릭하면).
	
	List<BoardVO> selectList(); // 목록

	BoardVO selectOne(int bno); // 단건조회. 글 번호를 기준으로

	int insertBoard(BoardVO vo); // 글 추가

	int updateBoard(BoardVO vo); // 글 수정

	int deleteBoard(int bno); // 글 삭제

	int updateCnt(int bno); // 조회수 증가

}
