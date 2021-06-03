<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 리스트</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/shopping.css">
</head>
<body>
	<div id="wrap" align="center">
		<h1>회원 리스트 - 관리자 페이지</h1>
		<table class="list">
			<tr>
				<th>이름</th>
				<th>아이디</th>
				<th>암호</th>
				<th>이메일</th>
				<th>전화번호</th>
				<th>회원등급</th>
			</tr>
			<c:forEach var="item" items="${memberList}">
				<tr class="record">
					<td>${item.name}</td>
					<td>${item.userid}</td>
					<td>${item.pwd} </td>
					<td>${item.email}</td>
					<td>${item.phone}</td>
					<td>${item.grade}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>