<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시글 목록</title>
<link rel="stylesheet" type="text/css" href="../css/shopping.css">
</head>
<body>
	<div id="wrap" align="center">
		<h1>게시글 리스트</h1>
		<table class="list">
			<tr>
				<td colspan="5" style="border: white; text-align: right"><a
					href="write.do">게시글 등록</a></td>
			</tr>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회</th>
			</tr>
			<c:forEach var="board" items="${boardList }">
				<tr class="record">
					<td>${board.num }</td>
					<td><a href="view.do?num=${board.num}">
							${board.title } </a></td>
					<td>${board.name}</td>
					<td><fmt:formatDate value="${board.writedate}" /></td>
					<td>${board.readcount}</td>
				</tr>
			</c:forEach>
		</table>
		<div id="paging">
		<c:url var="action" value="/board/list.do"/>
		<c:if test="${paging.prev}">
			<a href="${action }?page=${paging.beginPage-1 }">prev</a>
		</c:if>
		<c:forEach begin="${paging.beginPage }" end="${paging.endPage }" step="1" var="index">
			<c:choose>
				<c:when test="${paging.page == index }">
					${index }
				</c:when>
			<c:otherwise>
				<a href="${action }?page=${index}">${index }</a>
			</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:if test="${paging.next }">
			<a href="${action }?page=${paging.endPage + 1}">next</a>
		</c:if>
		</div>
	</div>
	
</body>
</html>