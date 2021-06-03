<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty loginUser}">
	<jsp:forward page='login.do' />
</c:if>
<!DOCTYPE
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 전용 패이지</title>
<script type="text/javascript" src="../js/member.js"></script>
</head>
<body>
	<h2>회원 전용 페이지</h2>
	<form action="logout.do">
		<table>
			<tr>
				<td>안녕하세요. ${loginUser.name}(${loginUser.userid})님</td>
			</tr>
			<tr>
				<c:url value="/member/update.do?userid=${loginUser.userid}" var="uurl" />
				<c:url value="/board/list.do" var="burl" />
				<c:url value="/product/list.do" var="advice" />
				<c:url value="/member/cryptPassword.do" var="member" />
				<td colspan="2" align="center">
					<input type="submit" value="로그아웃"> &nbsp;&nbsp; 
					<input type="button" value="회원정보변경" onclick="location.href='${uurl}'"> &nbsp;&nbsp;
					<input type="button" value="게시글 리스트" onclick="location.href='${burl}'"> &nbsp;&nbsp;
					<c:if test="${loginUser.grade == 1}">
						<input type="button" value="상품 관리" onclick="location.href='${advice}'">&nbsp;&nbsp;
					</c:if>
					<c:if test="${loginUser.grade == 1}">
						<input type="button" value="회원 관리" onclick="location.href='${member}'">
					</c:if>		
				</td>
			</tr>
		</table>
	</form>
</body>
</html>