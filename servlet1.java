package servletpractice6;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/divya")
public class servlet1 extends HttpServlet
{
	@Override
   public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		RequestDispatcher rd=req.getRequestDispatcher("/divya1");
		rd.forward(req, res);
	}

}
