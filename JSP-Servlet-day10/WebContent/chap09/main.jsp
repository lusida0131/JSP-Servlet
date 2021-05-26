<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty loginUser }">
	<jsp:forward page='login.do'/>
</c:if>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 전용 페이지</title>
<script type="text/javascript" src="chap09/js/member.js"></script>
</head>
<body>
	<h2>회원 전용 페이지</h2>
	<form action="logout.do">
		<table>
			<tr>
				<td>안녕하세요. ${loginUser.name }(${loginUser.useid })님
				</td>
			</tr>
			<tr>
				<td colspan="2" akign="center"><input type="submit" value="로그아웃"
				>&nbsp;&nbsp;<input type="button" value="회원정보 변경" onclick="location.href='memberUpdate.do>useid=${loginUser.useid}'">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>