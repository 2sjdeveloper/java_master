<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>promise2.jsp</title>
</head>
<body>
	<script>
	
		//247쪽
		
		fetch('data.json', {
			method: 'post',
			mode: 'cors',
			headers: {
				'Content-Type': 'application/x-www-form-urlencoded'
			},
			body: 'x=120&y=200'
		}) //매개값 : url, option객체
		.then(result => {
			console.log(result);
			return result.json(); //json : 문자열-> 객체로 변환
		})
		.then(json => {
			console.log(json);
		})
		.catch(error => {
			console.error(error);
		})
	</script>

</body>
</html>