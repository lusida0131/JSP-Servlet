<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>begin, end, step</title>
</head>
<body>
	<c:forEach var="cnt" begin="1" end="10" varStatus="status">
		${cnt } <c:if test="${not status.last }">,</c:if>
	</c:forEach>
	<br><br>
	<table border="1" style="width: 100%; text-align: center;">
		<tr>
			<th>index</th>
			<th>count</th>
			<th>cnt</th>
		</tr>
		<c:forEach var="cnt" begin="1" end="10" varStatus="status" step="2">
			<tr>
				<th>${status.index }</th>
				<th>${status.count }</th>
				<th>${movie }</th>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>