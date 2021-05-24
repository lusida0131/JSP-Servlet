<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>회원가입 폼</title>
</head>
<body>
	<h2>회원가입 폼</h2>
	<form method="post" action="form2.jsp">
	<label for="id">아이디 : </label>
	<input type="text" id="id" name="id"><br>
	<label for="pwd">암 &nbsp; 호 : </label>
	<input type="password" id="pwd" name="pwd"><br>
	<label for="name">이 &nbsp; 름 : </label>
	<input type="text" id="name" name="name"><br>
	<input type="submit"value="회원가입">
	</form>
</body>
</html>
