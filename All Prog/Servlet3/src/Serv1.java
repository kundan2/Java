

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("This is Serv1");
		//response.sendRedirect("Serv2");
		RequestDispatcher rd=request.getRequestDispatcher("Serv2");
		request.setAttribute("name", "Ashish");
		//rd.forward(request, response);
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
