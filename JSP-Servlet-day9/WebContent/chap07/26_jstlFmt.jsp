<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&lt;fmt&gt;태그</title>
</head>
<body>
	<pre>
		<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
		\${now } :${now }
		<fmt:formatDate value ="${now }"></fmt:formatDate>
		date: <fmt:formatDate value="${now }" type="date"></fmt:formatDate>
		time: <fmt:formatDate value="${now }" type="time"></fmt:formatDate>
		both: <fmt:formatDate value="${now }" type="both"></fmt:formatDate>
		default: <fmt:formatDate value="${now }" dateStyle="default" timeStyle="default"></fmt:formatDate>
		short: <fmt:formatDate value="${now }" type="both" dateStyle="short" timeStyle="short"></fmt:formatDate>
		medium: <fmt:formatDate value="${now }" type="both" dateStyle="medium" timeStyle="medium"></fmt:formatDate>
	</pre>
</body>
</html>