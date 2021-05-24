<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿 textarea</title>
</head>
<body>
	<form method="post" action="<%= request.getContextPath() %>/RadioServlet">
		성별 : <input type="radio" id="man" name="gender" value="남자" checked>
		<label for="man">남자</label>
		<input type="radio" id="woman" name="gender" value="여자" checked>
		<label for="woman">여자</label><br><br>
		메일 정보 수신 여부: <input type="radio" id="accept" name="chk_mail" value="yes" checked>
		<label for="accept">수신</label>
		<input type="radio" id="deny" name="chk_mail" value="no" checked>
		<label for="deny">거부</label><br><br>
		<label for="content">간단한 가입 인사를 적어 주세여 : )</label><br>
		<textarea id="content" name="content" rows="3" cols="35"></textarea><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>