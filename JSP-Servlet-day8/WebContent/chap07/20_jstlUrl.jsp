<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&lt;c:url&gt; 태그 사용 예<</title>
</head>
<body>
	<c:url value="images/pic.jpg" var="data"></c:url>
	<h3>${data}</h3>
	<img src="${data}" width='150' height='150'>
</body>
</html>