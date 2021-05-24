<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>쿠키삭제</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("id", "");
		cookie.setMaxAge(0);
		response.addCookie(cookie);
	%>
	<h3>id 쿠키가 삭제되었습니다.</h3>
	<a gref="02_getCookies.jsp">
	쿠키 삭제를 확인하려면 클릭하세요.
	</a>
</body>
</html>