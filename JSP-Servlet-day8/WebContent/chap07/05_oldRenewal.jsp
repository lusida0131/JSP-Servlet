<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자바 null 처리</title>
</head>
<body>
	자바 코드 <hr>
	<% if(request.getParameter("id") != null) { %>
	== 연산자 사용 결과 : <%=request.getParameter("id").equals("pinksung") %><br>
	<%} else {
		out.print("id를 전달해 주세요.");
	}
	%>
</body>
</html>