<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
</head>
<body>
<h2>로그인 폼</h2>
   <%-- 고민해야할 사항 : url의 경로를 어떻게 정해야 하는가?
   현재의 url 경로를 인식 : /jsp/chap01/loginForm.jsp(기준)
    -->
   <%--<form action ="loginPro" method = "get">--%><%-- 상대경로 url : /jsp/chap01/loginPro--%>
   <!-- <form action ="../loginPro" method = "get"> --><%-- 상대경로 url : /jsp/chap01/loginPro--%>
   <form action = "<%=request.getContextPath() %>/loginPro"method = "get"> <%--절대경로 --%>
      <label for = "id">아이디 : </label>
      <input type = "text" id= "id" name = "id" size = "20" required><br>
      <label for = "pw">비밀번호 : </label>
      <input type = "password" id = "pw" name= "pw" size = "20" required><br>
       <label for = "pws">비밀번호 중복확인 : </label>
       <input type = "password" id = "pws1" name= "pw" size = "20" required><br>
      <p><input type = "submit" value = "로그인"></p>   
   </form>
</body>
</html>