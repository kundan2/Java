package com.jwt.servlet;
 
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        String id = request.getParameter("id");
		String name = request.getParameter("name");
		String addre = request.getParameter("addre");
		String email = request.getParameter("email");
		String mno = request.getParameter("mno");
		String mark1 = request.getParameter("mark1");
		String mark2 = request.getParameter("mark2");
		String bemark = request.getParameter("bemark");
 
        try {
        	out.println("<style>\r\n" + 
        			"th{fon-size: 20px}\r\n" + 
        			"p{font-size: 30px}\r\n" + 
        			"input{width: 200px; height:50px; background-color: white;color: orange; font-size: 20px}\r\n" + 
        			"</style>");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/students", "root", "kundan");
 
            PreparedStatement ps = con
                    .prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");
 
            ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setString(3, addre);
			ps.setString(4, email);
			ps.setString(5, mno);
			ps.setString(6, mark1);
			ps.setString(7, mark2);
			ps.setString(8, bemark);
 
            int i = ps.executeUpdate();
            if (i > 0)
            	 out.print("<p align=\"center\">successfully added...</p>");
                 out.print("<table border=\"0\" align=\"center\">\r\n" + 
            		"<tr><td colspan=\"3\" align=\"center\"><p>Which Operation Want to Perform</p></td></tr>\r\n" + 
            		"<tr><td align=\"center\"><a href=\"add.jsp\"><input type =\"button\" name=\"add\" value=\"Add\"></a></td>\r\n" + 
            		"<td align=\"center\"><a href=\"delete.jsp\"><input type =\"button\" name=\"delete\" value=\"Delete\"></a></td>\r\n" + 
            		"<td align=\"center\"><a href=\"display.jsp\"><input type =\"button\" name=\"display\" value=\"Display\"></a></td></tr>\r\n" + 
            		"\r\n" + 
            		"</table>");
 
        } catch (Exception e2) {
            System.out.println(e2);
        }
 
        out.close();
    }
 
}