<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.cnc.Student" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>

<jsp:getProperty property="rollno" name="obj"/><br>
<jsp:getProperty property="name" name="obj"/><br>
<jsp:getProperty property="per" name="obj"/>
</body>
</html>