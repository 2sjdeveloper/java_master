<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- member/memberList.jsp -->

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h3>회원목록</h3>



<table class="table">
	<thead>
		<th>아이디</th>
		<th>비밀번호</th>
		<th>이름</th>
		<th>권한</th>
	</thead>

	<tbody>
		<!-- 달러 중괄호.를 el 이라고 함. 익스프레션 랭기지. 그리고 주석에도 쓰면 안됨. 주석에 쓰더라도 실행되어버리기때무네... -->
		<c:forEach var="vo" items="${memberList}">
		

			<tr>
				<td><a href="getMember.do?id=${vo.id }">${vo.id }</a></td>
				<td>${vo.pw }</td>
				<td>${vo.name }</td>
				<td>${vo.responsibility }</td>
			</tr>
			
		</c:forEach>
	</tbody>
</table>
