<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="per" value="15" scope="session"></c:set>

<c:choose>
<c:when test="${per>=75 && per<=100}">
	<c:out value="A"></c:out>
</c:when>
<c:when test="${per>=60}">
	<c:out value="B"></c:out>
</c:when>
<c:when test="${per>=50}">
	<c:out value="C"></c:out>
</c:when>
<c:when test="${per>=35}">
	<c:out value="D"></c:out>
</c:when>
<c:otherwise>
	<c:out value="Fail"></c:out>
</c:otherwise>

</c:choose>

</body>
</html>