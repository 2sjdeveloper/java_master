package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyInfoServlet") // url에 /마이인포어쩌고 입력하면 이거 나옴..

public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyInfoServlet() { // 기본생성자
		super();

	}

	// coGet, doPost : 둘 다 메소드
	// 리퀘스트, 리스판스 매개값.. 어쩌구..
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8"); // content 타입 : txt, html, json,

		// 파라미터 확인
		// 사용자가 입력했던 파라미터 확인. 스튜던트에서 입력한거
		// ?sno=23-010&sname=황철수&escore=80&mscore=85
		String sno = request.getParameter("sno");
		String sname = request.getParameter("sname");
		String escore = request.getParameter("escore");
		String mscore = request.getParameter("mscore");

		System.out.println("sno: " + sno + ",sname: " + sname + ",escore: " + escore + ",mscore" + mscore);

		// db 저장.
		Student std = new Student(sno, sname, Integer.parseInt(escore), Integer.parseInt(mscore));
		StudentDAO dao = new StudentDAO();
		boolean done = dao.addStudent(std);

		PrintWriter out = response.getWriter();
		// out.response.getWriter().append("Served at:
		// ").append(request.getContextPath());

		out.println("<h3>Welcome Servlet. Sujin! 안녕 수진</h3>");
		out.println("<a href='index.html'>인덱스 이동</a>"); // 인덱스로 이동

		if (done) {
			out.println("<script>alert('OK'); location.href='student/studentList.jsp'; </script>");
		} else {
			out.println("<script>alert('Fail'); location.href='index.html'; </script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
