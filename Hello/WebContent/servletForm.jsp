<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>회원가입 폼</title>
<script type="text/javascript" src="js/formparams.js"></script>
</head>
<body>
	<h2>회원가입 폼</h2>
	<form method="post" action="<%=request.getContextPath() %>/ServletForm" name="frm">
	<label for="id">아이디 : </label>
	<input type="text" id="id" name="id"><br>
	<label for="name">나 &nbsp; 이 : </label>
	<input type="text" id="age" name="age"><br>
	<input type="submit" value="전송" onclick="return check()">
	</form>
</body>
</html>
