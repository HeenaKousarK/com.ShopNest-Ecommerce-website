package com.ShopNest.customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	{
		try {
			res.setContentType("text/html");
			PrintWriter out=res.getWriter();
			HttpSession session=req.getSession();
			session.invalidate();
			out.print("you are successfully logged out");
			req.getRequestDispatcher("login.jsp").include(req, res);
			out.close();
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
