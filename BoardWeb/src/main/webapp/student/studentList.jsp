<%@page import="common.Student"%>
<%@page import="java.util.List"%>
<%@ page import="common.StudentDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- < % @ 다음 지시자 사용 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>studentList.jsp</title>
</head>
<body>
	<table border='1'>
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>영어점수</th>
				<th>수학점수는</th>
			</tr>
		</thead>
		<tbody>
			<%
			StudentDAO dao = new StudentDAO();
			List<Student> list = dao.getStudentlist();

			for (Student std : list) {
			%>
			<tr>
				<td><a href="studentInfo.jsp?sno=<%=std.getStuNo()%>"><%=std.getStuNo()%></a></td>
				<td><%=std.getStuName()%></td>
				<td><%=std.getEng()%></td>
				<td><%=std.getMath()%></td>

				<!-- 변수의 값을 읽어올 때 " = " 사용 -->

			</tr>
			<%
			}
			%>
		</tbody>
	</table>




</body>
</html>