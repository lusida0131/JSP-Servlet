<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>post 방식 입력 한글 처리</title>
</head>
<body>
	<%-- 
	<%
	request.setCharacterEncoding("UTF-8");
	%>
	이름 : <%= request.getParameter("name") %>
	--%>
	<fmt:requestEncoding value="UTF-8" />
	이름 : ${param.name}	
</body>
</html>