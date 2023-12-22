package com.yedam.board.service;

import java.util.List;

import com.yedam.board.vo.BoardVO;

public interface BoardService {
	// 업무로직.
	public List<BoardVO> boardList(); // 목록. 글 목록 가져오기

	public BoardVO getBoard(int bno); // 글번호 조회. 글 번호를 기준으로 조회.

	public boolean addBoard(BoardVO vo); // 글등록. 글 등록하는 기능

	public boolean modBoard(BoardVO vo); // 글수정.

	public boolean remBoard(int vno); // 글삭제. 글 번호로 글 삭제하는 기능.

}
