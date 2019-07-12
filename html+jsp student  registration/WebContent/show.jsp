<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
th{fon-size: 20px}
p{font-size: 30px}
input{width: 200px; height:50px; background-color: white;color: orange; font-size: 20px}
</style>
</head>
<body>
<%@page import="java.sql.*" %>
<%@page import="javax.sql.*" %>
<%@page import="java.sql.Connection" %>
<%
String id = request.getParameter("id");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","kundan");
Statement st=con.createStatement();
String query="select * from user where id='"+id+"'";
ResultSet rs=st.executeQuery(query);
%>

<%
while(rs.next())
{
%>

<table border="2" bordercolor="#2494b7" align="center">
<tr>
<th>id</th>
<th>Name</th>

<th>Address</th>
<th>Email</th>
<th>Mobile Number</th>
<th>10th Mark</th>
<th>12th Mark</th>
<th>BE mark</th>
</tr>
<tr>
<td><%=rs.getInt(1)%></td>
<td><%=rs.getString(2)%></td>

<td><%=rs.getString(3)%></td>
<td><%=rs.getString(4)%></td>
<td><%=rs.getInt(5)%></td>
<td><%=rs.getInt(6)%></td>
<td><%=rs.getInt(7)%></td>
<td><%=rs.getInt(8)%></td>
</tr>
</table>
<%
}
%>

<table border="0" align="center">
<tr><td colspan="3" align="center"><p>Which Operation Want to Perform</p></td></tr>
<tr><td align="center"><a href="add.jsp"><input type ="button" name="add" value="Add"></a></td>
<td align="center"><a href="delete.html"><input type ="button" name="delete" value="Delete"></a></td>
<td align="center"><a href="display.html"><input type ="button" name="display" value="Display"></a></td></tr>

</table>
<%

%>
</body>
</html>