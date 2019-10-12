<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
		<c:when test="${mode=='MODE_HOME' }"> 
		<h1>User home</h1>
		<c:forEach var="user" iteams="${users}">
			<h3>${user.id}</h3>
		</c:forEach>
		</c:when>
</c:choose>
</body>
</html>