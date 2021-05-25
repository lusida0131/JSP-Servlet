<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>입력 폼(한글 이름 처리)</title>
</head>
<body>
	<h3>post 방식에서 한글 깨짐 방지</h3>
	<form method="post" action="29_jstlFmt.jsp">
		이름 : <input type="text" name="name">
		<input type="submit" value="전송">
	</form>
</body>
</html>