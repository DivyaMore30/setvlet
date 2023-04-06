package servletpractice6;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/divya1")
public class servlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		System.out.println(req.getParameter("username")); 
		System.out.println(req.getParameter("id"));
		System.out.println(req.getParameter("password")); 
	}

}
