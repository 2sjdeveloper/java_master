package com.yedam.reply.command;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.reply.service.ReplyService;
import com.yedam.reply.serviceImpl.ReplyServiceImpl;

public class DelReplyJson implements Control {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String rno = req.getParameter("rno");

		ReplyService svc = new ReplyServiceImpl();

		try {
			if (svc.removeReply(Integer.parseInt(rno))) {
				// {"retCode" : "OK"} retCode=returnCode
				resp.getWriter().print("{\"retCode\": \"OK\"}");

				resp.getWriter().print("");
			} else {
				// {"retCode" : "NG"}
				resp.getWriter().print("{\"retCode\": \"NG\"}");				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
