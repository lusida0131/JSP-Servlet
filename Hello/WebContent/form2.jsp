<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
</head>
<body>
	<h2>회원가입 폼</h2>
	<%request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	out.println("아이디 : " + id + "<br><br>");
	
	String pwd = request.getParameter("pwd");
	out.println("비밀번호 : " + pwd + "<br><br>");
	
	String name = request.getParameter("name");
	out.println("이름 : " + name + "<br><br>");
	%>
	<b><a href='javascript:history.go(-1)'>다시</a></b>
</body>
</html>