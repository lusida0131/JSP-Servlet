<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>varStatus 속성</title>
</head>
<body>
	<%
		String[] movieList = {"타이타닉", "시네마 천국", "혹성탈출", "킹콩"};
		pageContext.setAttribute("movieList", movieList);
	%>
	<table border="1" style="width: 100%; text-align: center;">
		<tr>
			<th>index</th>
			<th>count</th>
			<th>title</th>
		</tr>
		<c:forEach var="movie" items="${movieList }" varStatus="status">
			<tr>
				<th>${status.index }</th>
				<th>${status.count }</th>
				<th>${movie }</th>
			</tr>
		</c:forEach>
</body>
</html>