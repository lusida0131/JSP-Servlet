<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<%@ page import="dao.MemberDAO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberDAO DBCP 테스트</title>
</head>
<body>
	<%
		MemberDAO memDao = MemberDAO.getInstance();
		Connection conn = memDao.getConnection();
		out.println("DBCP 연동 성공");
	%>
</body>
</html>