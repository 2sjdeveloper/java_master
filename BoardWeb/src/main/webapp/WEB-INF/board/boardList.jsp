
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<h3>게시판</h3>
<!-- EL(Expression Language) -->
${3>2? '참':'거짓' }
<table class="table">
	<thead>
		<th>글번호</th>
		<th>제목</th>
		<th>작성자</th>
		<th>작성일시</th>
		<th>조회수</th>
	</thead>

	<tbody>
		<!-- 달러 중괄호.를 el 이라고 함. 익스프레션 랭기지. 그리고 주석에도 쓰면 안됨. 주석에 쓰더라도 실행되어버리기때무네... -->
		<c:forEach var="vo" items="${boardList}">
		

			<tr>
				<td>${vo.boardNo }</td>
				<td><a href="getBoard.do?bno=${vo.boardNo}">${vo.title }</a></td>
				<td>${vo.writer }</td>
				<td><fmt:formatDate value="${vo.writeDate }" pattern ="yyyy-MM-dd" /></td>
				
				<td>${vo.clickCnt}</td>
			</tr>
			
		</c:forEach>
	</tbody>
</table>

<jsp:include page="../layout/foot.jsp"></jsp:include>