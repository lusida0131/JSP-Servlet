<%@page import="chap01.Clock"%> <%-- JSP 주석문 --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   <%-- page 디렉티브: jsp를 설정 --%>
    <% //자바문법을 작성할 수 있는 영역 : 스크립트릿 
    Clock clock = new Clock(); 
    // import 하는 방법은 class 이름뒤에 위치한 후 control + space를 누르면 선택 가능한 클래스 지정
    %> <%-- 다른 클래스를 사용하려면 import를 해주어야 함 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재 시간 출력</title>
</head>
<body>
	현재 시간은 <%= clock.now() %> 입니다. <%-- 표현식 : 브라우저로 출력(변수, 함수의 반환값, 문자열) --%>
</body>
</html>