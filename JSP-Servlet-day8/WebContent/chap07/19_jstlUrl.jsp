<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>>&lt;c:import&gt; 태그</title>
</head>
<body>
	<c:import url="http://localhost:8080/jsp/chap07/02_el.jsp" var="data">
	</c:import>
	${data}
</body>
</html>