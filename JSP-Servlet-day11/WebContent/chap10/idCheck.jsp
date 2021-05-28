<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복 체크</title>
<script type="text/javascript" src="chap10/js/member.js"></script>
</head>
<body>
	<h2>아이디 중복확인</h2>
	<form action="idCheck.do" method="get" name="frm">
		아이디<input type=text name="useid" value="${useid}"><input type=submit value="중복 체크"><br>
		<c:if test="${result == 1}">
			<script type="text/javascript">
				opener.document.frm.useid.value="";
			</script>
			${useid }는 이미 사용중인 아이디입니다.
		</c:if>
		<c:if test="${result== -1 }">
			${useid}는 사용가능한 아이디 입니다.
			<input type="button" value="사용" class="cancel" onclick="idok('${useid}')">
		</c:if>
	</form>
</body>
</html>