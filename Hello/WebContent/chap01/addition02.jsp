<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>두수의 합</title>
</head>
<body>
<% //자바 문법을 적용하는 영역(제어: control)
	int num1 = 20;
	int num2 = 30;
	int add = num1 + num2;
%>
<%= num1 %>+<%=num2%>=<%=add %> <!-- 브라우저로 출력되는 부분 -->
</body>
</html>