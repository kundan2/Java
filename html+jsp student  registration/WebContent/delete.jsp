<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>

p{font-size: 40px}
input{width: 200px; height:50px; background-color: white;color: orange; font-size: 20px}

</style>
</head>
<body bgcolor="orange">
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="javax.sql.*" %>
<%@page import="java.sql.Connection" %>
<%
int rolln = Integer.parseInt(request.getParameter("rolln"));
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","kundan");
Statement st=con.createStatement();
try
{
st.executeUpdate("DELETE FROM user WHERE id = '"+rolln+"'");
boolean flag=true;
if(flag==true)
{

%>
<p align="center">Database Deleted</p>
<table border="0" align="center">
<tr><td><p>Which Operation Want to Perform</p></td></tr>
<tr><td align="center"><a href="add.jsp"><input type ="button" name="add" value="Add"></a></td></tr>
<tr><td align="center"><a href="delete.html"><input type ="button" name="delete" value="Delete"></a></td></tr>
<tr><td align="center"><a href="display.html"><input type ="button" name="display" value="Display"></a></td></tr>

</table>
<%
}
else
{
out.println("Not possible : error!");
}
}
catch(Exception e)
{
out.println("Exception");
}

%>
</body>
</html>