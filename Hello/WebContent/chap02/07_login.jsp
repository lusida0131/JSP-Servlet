<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿-로그인폼</title>
</head>
<body>
	<form method="post" action="<%=request.getContextPath() %>/LoginProServlet">
		<label for = "userid">아이디 : </label>
		<input type="text" id="userid" name="id"><br>
		<label for = "userpwd">비밀번호 : </label>
		<input type="text" id="userpwd" name="pwd"><br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>