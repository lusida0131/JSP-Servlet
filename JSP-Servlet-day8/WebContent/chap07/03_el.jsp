<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>표현언어-연산자</title>
</head>
<body>
	\${5 + 2} : ${5 + 2} <br>
	\${5 / 2} : ${5 / 2} <br>
	\${5 div 2} : ${5 div 2} <br>
	\${5 mod 2} : ${5 mod 2} <br>
	\${5 > 2} : ${5 > 2} <br>
	\${5 gt 2} : ${5 gt 2} <br>
	\${(5 > 2) ? 5 : 2} : ${(5 > 2) ? 5 : 2} <br>
	\${(5 > 2) || ( 2 < 11)} : ${(5 > 2) || (2 < 10)} <br>
	<% String input=null; %>
	\${empty input} : ${empty input} <br>
</body>
</html>