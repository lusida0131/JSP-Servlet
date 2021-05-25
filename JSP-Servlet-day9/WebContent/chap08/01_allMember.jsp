<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%! // 선언부는 첫 방문자에 의해서 단 한번 수행합니다. 
	Connection conn=null;
	Statement stmt = null;
	ResultSet rs = null;
	String url = "jdbc:mysql://localhost:3306/member";
	String uid = "root";
	String pass = "12341234";
	String sql = "select * from member";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보 출력</title>
</head>
<body>
	<table width='800' border='1'>
		<tr>
			<th>이름</th>
			<th>아이디</th>
			<th>암호</th>
			<th>이메일</th>
			<th>전화번호</th>
			<th>권한(1:관리자, 2:일반회원)</th>
		</tr>
		<%
			try {
					Class.forName("com.mysql.cj.jdbc.Driver"); // JDBC 드라이버 로딩
					conn = DriverManager.getConnection(url, uid, pass); // DB 커넥션 생성
					stmt = conn.createStatement(); // statement 생성
					rs = stmt.executeQuery(sql); // 쿼리 실행
					while (rs.next()) { // 쿼리 실행 결과 출력
						out.println("<tr>");
						out.println("<td>" + rs.getString("name") + "</td>");
						out.println("<td>" + rs.getString("useid") + "</td>");
						out.println("<td>" + rs.getString("pwd") + "</td>");
						out.println("<td>" + rs.getString("email") + "</td>");
						out.println("<td>" + rs.getString("phone") + "</td>");
						out.println("<td>" + rs.getInt("grade") + "</td>");
						out.println("</tr>");
					}//while의 끝
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null) // 사용한 ResultSet 종료
						rs.close();
					if (stmt != null) // 사용한 Statement 종료
						stmt.close();
					if (conn != null) // 사용한 커넥션 종료
						conn.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
			} //finally의 끝
			%>
	</table>
</body>
</html>