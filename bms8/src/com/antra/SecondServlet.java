package com.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.antra.EmployeeVO;

public class SecondServlet extends HttpServlet{

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	
		HttpSession session=request.getSession(true);
		PrintWriter out=response.getWriter();
		out.println("it is session id:"+session.getId());
		out.print("is new?:" +session.isNew());
		//session.setAttribute("abc", "kumar");
		List al=new ArrayList();
		al.add(new EmployeeVO("1","manas",123));
		al.add(new EmployeeVO("2","kumar",1234));
		al.add(new EmployeeVO("3","jagdish",1235));
		al.add(new EmployeeVO("4","kiran",1236));
		al.add(new EmployeeVO("5","kishore",1237));
		al.add(new EmployeeVO("6","vikram",1238));
		al.add(new EmployeeVO("7","Richard",1239));
		al.add(new EmployeeVO("8","paul",1230));
		request.setAttribute("list", al);
		RequestDispatcher rd=request.getRequestDispatcher("Two.jsp");
		rd.forward(request, response);
		/*	
		ServletConfig config=getServletConfig();
		String uname=config.getInitParameter("uname");
		System.out.println(uname);
		
		Cookie c[]=request.getCookies();
		if(c!=null) {
			
			for(int i=0;i<c.length;i++) {
				PrintWriter out=response.getWriter();
				out.println(c[i].getName());
				out.print(c[i].getValue());
			}
			
		}*/
		
		
	} 
}
