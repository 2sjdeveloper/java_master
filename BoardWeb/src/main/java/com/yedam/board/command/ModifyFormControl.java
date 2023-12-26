package com.yedam.board.command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.board.service.BoardService;
import com.yedam.board.serviceImpl.BoardServiceMybatis;
import com.yedam.board.vo.BoardVO;
import com.yedam.common.Control;

public class ModifyFormControl implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// 글번호 하나를 조회하는 기능.
		String bno = req.getParameter("bno");

		BoardService svc = new BoardServiceMybatis();
		BoardVO vo = svc.getBoard(Integer.parseInt(bno));

		req.setAttribute("vo", vo);

		// 페이지 이동(forward)
		RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/board/modBoardForm.jsp"); // 요청을 재지정해주는 역할
		try {
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
}
