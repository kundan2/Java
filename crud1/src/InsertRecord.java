

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertRecord
 */
@WebServlet("/InsertRecord")
public class InsertRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		int mark=Integer.parseInt(request.getParameter("mark"));
		String city=request.getParameter("city");
		
		try
		{			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			PreparedStatement ps=con.prepareStatement("insert into student(name,mark,city) values(?,?,?)");
			ps.setString(1, name);
			ps.setInt(2, mark);
			ps.setString(3, city);
			int row = ps.executeUpdate();
			if(row>0)
			{
				out.print("<script>alert('Data Inserted Successfully');window.location='InsertData';</script>");				
			}
			else
			{
				out.print("<script>alert('Data Not Inserted Successfully');window.location='InsertData';</script>");
			}
		}
		catch(Exception e)
		{			
			System.out.println(e);
		}
		
	}

}
