<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>자바 비교 방법</title>
</head>
<body>
	자바 코드 <br>
	== 연산자 사용 결과: <%=request.getParameter("id") == "pinksung" %><br>
	equals() 사용 결과 : <%=request.getParameter("id").equals("pinksung") %><br>
</body>
</html>