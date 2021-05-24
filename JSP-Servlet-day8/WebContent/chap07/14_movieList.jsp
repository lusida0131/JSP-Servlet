<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>영화 목록 출력</title>
</head>
<body>
	<%
		String[] movieList = {"타이타닉", "시네마 천국", "혹성탈출", "킹콩"};
		pageContext.setAttribute("movieList", movieList);
	%>
	<c:forEach var="movie" items="${movieList }">
		${movie }<br>
	</c:forEach>
</body>
</html>