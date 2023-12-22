package com.yedam.common;
// 컨트롤러 역할 : url 요청에 따른 실행 서블릿을 매칭 시켜주는 서블릿.

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @webServlet("*.do")

public class FrontController extends HttpServlet {
//생명주기 : 프로그램이 실행됐다가 사라지는것. 톰캣이 정함.
	// : 생성자 -> init() -> service() -> destroy() ( () << 메소드라는 의미)

	Map<String, Control> map; // <키(url) ,value(서블릿)>

	public FrontController() {
		System.out.println("생성자 호출");
		map = new HashMap<String, Control>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 호출");
		map.put("/main.do", new MainControl()); // 메인쩜두가 들어오면 메인 컨트롤러 실행
		map.put("/sub.do", new SubControl()); // 서브쩜두가 들어오면 서브 컨트롤 실행
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service() 호출");
		String url = req.getRequestURI(); // /BoardWeb/main.do
		String context = req.getContextPath(); // /BoardWeb 값을 가져옴.
		String path = url.substring(context.length()); // 메인쩜두와 서브쩜두를 구분하는 키 역할.
		System.out.println(path);
		
		Control ctrl = map.get(path);
		ctrl.execute(req, resp);
	}

	@Override
	public void destroy() {
		System.out.println("destroy() 호출");
	}
}
