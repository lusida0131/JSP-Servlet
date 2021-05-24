<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿</title>
</head>
<body>
	<!-- GET과 POST 방법으로 form을 이요하여 데이터를 서버를 전달 -->
	<form method="get" action="<%=request.getContextPath()%>/MethodServlet">
		<input type="submit" value="get 방식으로 호출하기">
	</form>
	<br><br>
	<form method="post" action="<%=request.getContextPath()%>/MethodServlet">
		<input type="submit" value="post 방식으로 호출하기">
	</form>
</body>
</html>