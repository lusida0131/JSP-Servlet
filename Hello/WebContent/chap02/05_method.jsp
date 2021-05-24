<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서블릿에서 파라미터 얻기 : 폼 출력</title>
<script type="text/javascript" src="js/params.js"></script>
</head>
<body>
<form action="<%=request.getContextPath()%>/ParamServlet" method="post" name="frm">
아이디 : <input type="text" name="id"><br> <!-- 서버에서는 name attribute가 필요 -->
나 &nbsp; 이 : <input type="text" name="age"><br>
<input type="submit" value="전송" onclick="return check()"> <!--  자바스크립트가 동작하도록 설정 -->
</form>
</body>
</html>