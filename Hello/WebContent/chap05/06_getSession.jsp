<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset="UTF-8">
<title>세션에 설정된 모든 값 얻어오기</title>
</head>
<body>
	<%
	Enumeration<String> names = session.getAttributeNames();
	while(names.hasMoreElements()) {
		String name = names.nextElement().toString();
		String value = session.getAttribute(name).toString();
		out.println(name + " : " + value + "<br>");
	%>	
</body>
</html>