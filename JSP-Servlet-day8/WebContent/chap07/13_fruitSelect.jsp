<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ perfix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>과일 선택 결과</title>
</head>
<body>
	<c:choose>
		<c:when test="${param.fruit == 1}">
			<span style="color:red;">사과</span>
		</c:when>
		<c:when test="${param.fruit == 2}">
			<span style="color:green;">메론</span>
		</c:when>
		<c:when test="${param.fruit == 3}">
			<span style="color:blue;">바나나</span>
		</c:when>
	</c:choose>
</body>
</html>