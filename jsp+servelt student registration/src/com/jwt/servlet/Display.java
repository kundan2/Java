package com.jwt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display
 */

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
        
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        java.sql.Connection con = null;
        java.sql.PreparedStatement pst = null;
        ResultSet rs = null;
        out.print("<body>");
        String id = request.getParameter("id");
        out.print("<table border=\"2\" bordercolor=\"#2494b7\" align=\"center\">\r\n" + 
        		"<tr>\r\n" + 
        		"<th>id</th>\r\n" + 
        		"<th>Name</th>\r\n" + 
        		"\r\n" + 
        		"<th>Address</th>\r\n" + 
        		"<th>Email</th>\r\n" + 
        		"<th>Mobile Number</th>\r\n" + 
        		"<th>10th Mark</th>\r\n" + 
        		"<th>12th Mark</th>\r\n" + 
        		"<th>BE mark</th>\r\n" + 
        		"</tr>");
        try {
        	
        	out.println("<style>\r\n" + 
        			"th{fon-size: 20px}\r\n" + 
        			"p{font-size: 30px}\r\n" + 
        			"input{width: 200px; height:50px; background-color: white;color: orange; font-size: 20px}\r\n" + 
        			"</style>");
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/students", "root", "kundan");
            pst = con.prepareStatement("SELECT * FROM user WHERE id ='"+id+"';");
            rs = pst.executeQuery();
            while (rs.next()){
            	
            out.print("<tr><td>");
            out.println(rs.getInt(1));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(2));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(3));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(4));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(5));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(6));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(7));
            out.print("</td>");
            
            out.print("<td>");
            out.println(rs.getString(8));
            out.print("</td></tr>");
            }
        }catch (Exception e2) {
            System.out.println(e2);
        out.close();
	}
        out.print("</table>");
        out.print("<table border=\"0\" align=\"center\">\r\n" + 
        		"<tr><td colspan=\"3\" align=\"center\"><p>Which Operation Want to Perform</p></td></tr>\r\n" + 
        		"<tr><td align=\"center\"><a href=\"add.jsp\"><input type =\"button\" name=\"add\" value=\"Add\"></a></td>\r\n" + 
        		"<td align=\"center\"><a href=\"delete.jsp\"><input type =\"button\" name=\"delete\" value=\"Delete\"></a></td>\r\n" + 
        		"<td align=\"center\"><a href=\"display.jsp\"><input type =\"button\" name=\"display\" value=\"Display\"></a></td></tr>\r\n" + 
        		"\r\n" + 
        		"</table>");
        out.print("</body>");
        
	}
}
