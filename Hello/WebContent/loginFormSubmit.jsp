<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력</title>
</head>
<body>
	<%
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	out.println("<html><head><title>회원정보 출력</title></head>");
	out.println("<body>");
	out.println("<h2>회원 정보</h2>");
	out.println("아이디 : " + id + "<br>");
	out.println("암 &nbsp; 호: " + pwd + "<br>");
	out.println("이 &nbsp; 름: " + name + "<br>");
	out.println("성 &nbsp; 별: " + gender + "<br>");
	
	String items[] = request.getParameterValues("item");
	if(items == null) {
		out.print("선택된 항목이 없습니다.");
		
	} else {
		out.println("관심사 : ");
		for(String item : items) {
			out.print(item + " ");
		}
	}
	out.println("</body");
	out.println("</html");
	out.close();
	%>
</body>
</html>