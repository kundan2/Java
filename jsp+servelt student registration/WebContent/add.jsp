<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{font-size: 40px;color: orange}
th{color: orange}
input{width:300px;height:30px}
</style>
</head>
<body bgcolor="orange">
<%@page import="java.sql.*" %>
<%! int no; %>
<%@page import="java.io.*" %>
<%@page import="javax.sql.*" %>
<%@page import="java.sql.Connection" %>
<% 
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","kundan");
ResultSet rs = null;
Statement st = con.createStatement();
String sql = ("select id from user");

rs=st.executeQuery(sql);
while (rs.next()) { 
no=rs.getInt("id")+1;

}
rs.close();
st.close();
con.close();
}
catch(Exception e){}
%> 

<form method="post" action="register">
<table border="0" align="center" bgcolor="#D92D08">
<tr><th colspan="2" align="center"><h1>Student Registration</h1></th></tr>
<tr><td>ID</td><td><input type ="number" name="id" value="<%= no%>" ></td></tr>
<tr><td>Name</td><td><input type ="text" name="name"></td></tr>

<tr><td>Address</td><td><input type ="text" name="addre"></td></tr>
<tr><td>Email id</td><td><input type ="email" name="email"></td></tr>
<tr><td>Mobile No.</td><td><input type ="number" name="mno"></td></tr>
<tr><td>10th Mark</td><td><input type ="number" name="mark1"></td></tr>
<tr><td>12th Mark</td><td><input type ="number" name="mark2"></td></tr>
<tr><td>BE Mark</td><td><input type ="number" name="bemark"></td></tr>
<tr><td colspan="2" align="center"><input type ="Submit" name="submit"></td></tr>

</table>
</form>
</body>
</html>