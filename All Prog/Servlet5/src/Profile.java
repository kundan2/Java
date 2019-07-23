

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Profile")
public class Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Profile() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		
		//HttpSession ses = request.getSession(false);
		Cookie []arr=request.getCookies();
		//if(ses!=null)
		if(arr!=null)
		{
			//String name= (String)ses.getAttribute("myuname");
			String name=arr[0].getValue();
			if(!name.equals("") && name!=null)
			{
				out.print("Hello "+name);
			}
		}
		else
		{
			out.print("<script>alert('Login FIrst');window.location='Login'</script>");
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
