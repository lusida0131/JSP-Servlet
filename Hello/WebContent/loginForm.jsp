<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
</head>
<body>
	<h2>회원 가입</h2>
	<fieldset>
	<legend>로그인 정보</legend>
	<form method="post" action="<%= request.getContextPath()%>/LoginForm">
	<label for="id">아이디 : </label>
	<input type="text" id="id" name="id"><br>
	<label for="pwd">암 &nbsp; 호 : </label>
	<input type="password" id="pwd" name="pwd"><br>
	<label for="name">이 &nbsp; 름 : </label>
	<input type="text" id="name" name="name"><br>
	</fieldset>
	
	<fieldset>
	<legend>개인정보</legend>
	성별 : <input type="radio" id="man" name="gender" value="남자" checked>
	<label for=“man">남자</label>
	<input type="radio" id="woman" name="gender" value="여자">
	<label for="woman">여자</label><br><br>
	악세사리 : <input type="checkbox" name="item" value="신발">신발
	<input type="checkbox" name="item" value="가방">가방
	<input type="checkbox" name="item" value="벨트">벨트
	<input type="checkbox" name="item" value="모자">모자
	<input type="checkbox" name="item" value="시계">시계
	<input type="checkbox" name="item" value="보석">보석<br>
	</fieldset>
	
	<input type="submit"value="회원가입">
	<input type="submit"value="다시쓰기">
	</form>
</body>
</html>