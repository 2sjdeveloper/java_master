package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class AddBoardControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// parameter (3개-title, content, writer), db에 insert, 목록 보여주는 페이지.
		String title = req.getParameter("title");
		String writer =req.getParameter("writer");
		String content =req.getParameter("content");
		
		BoardVO vo = new BoardVO();	
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		
		//svc : addBoard() 메소드를 활용해서
		BoardService svc = new BoardServiceMybatis();
		
		if(svc.addBoard(vo)) {
			try {
				resp.sendRedirect("boardList.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			try {
				resp.sendRedirect("boardForm.do");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
