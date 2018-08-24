package com.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ThirdServlet extends HttpServlet{

	public void init() {
		System.out.println("in init method");
	}
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
	
		HttpSession session=request.getSession(true);
		Object obj=session.getAttribute("abc");
		String str=(String)obj;
		/*PrintWriter out=response.getWriter();
		out.println(str);*/
		/*	
		Cookie c1=new Cookie("uname","manas");
		c1.setMaxAge(6000);
		
		response.addCookie(c1);*/
		System.out.println("in service method");
		session.setAttribute("list", "manas");
		request.getRequestDispatcher("One.jsp").include(request, response);
	}
	public void destroy() {
		System.out.println("in destroy");
	}
}
