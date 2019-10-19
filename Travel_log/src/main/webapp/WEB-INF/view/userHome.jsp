<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>	
	<c:when test="${mode=='MODE_HOME' }">
		<c:forEach var="user" items="${users}">			
			<h3>${user.username}</h3>			
		</c:forEach>
	</c:when>
	<c:when test="${mode=='MODE_HOME' }">
		<h1>Hello ${message}</h1>
		<div id="message">${message}</div>
	</c:when>
	
</c:choose>
</body>
</html>