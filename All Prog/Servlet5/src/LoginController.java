

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		//HttpSession ses=null;
		
		if(uname.equals("Admin") && pass.equals("123"))
		{
		//	ses=request.getSession();
			//ses.setAttribute("myuname", uname);
			Cookie ck=new Cookie("myuname", uname);
			response.addCookie(ck);
			response.sendRedirect("Profile");
		}
		else
		{
			out.print("<script>alert('InValid User')</script>");			
		}
	}

}
