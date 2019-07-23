

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateData
 */
@WebServlet("/UpdateData")
public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		out.print("<html>" +
				"<body>" +
				"<form action='UpdateRecord' method='post'>" +
				"<table align='center'>" +
				"<tr>" +
				"<td>Roll No : </td>" +
				"<td><input type='text' name='rollno'></td>" +
				"</tr>" +
				"<tr>" +
				"<td>Name : </td>" +
				"<td><input type='text' name='name'></td>" +
				"</tr>" +
				"<tr>" +
				"<td>Mark : </td>" +
				"<td><input type='text' name='mark'></td>" +
				"</tr>" +
				"<tr>" +
				"<td>City : </td>" +
				"<td><input type='text' name='city'></td>" +
				"</tr>" +
				"<tr>" +
				"<td><input type='reset' value='reset'></td>" +
				"<td><input type='submit' value='Update'></td>" +
				"</tr>" +
				"</table>" +
				"</form>" +
				"</body>" +
				"</html>");
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
