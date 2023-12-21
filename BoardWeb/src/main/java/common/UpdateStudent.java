package common;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateStudent")
public class UpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UpdateStudent() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");

		String sno = request.getParameter("sno");
		String eng = request.getParameter("escore");
		String math = request.getParameter("mscore");
		StudentDAO dao = new StudentDAO();

		boolean done = dao.modifyStudent(sno, Integer.parseInt(eng), Integer.parseInt(math));
		PrintWriter out = response.getWriter();
		if (done) {
			out.println("<script>alert('OK'); location.href='StudentListServ.srv'; </script>");
		} else {
			out.println("<script>alert('Fail'); location.href='index.html'; </script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
