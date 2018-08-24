package com.antra;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet{


	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sal=request.getParameter("sal");
		
		int id1=Integer.parseInt(id);
		
		try {
			ServletContext context=getServletContext();
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			String url=context.getInitParameter("url");
			String uname=context.getInitParameter("uname");
			String password=context.getInitParameter("password");
			Connection con=DriverManager.getConnection(url,uname,password);
			System.out.println(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out=response.getWriter();
		out.println("you have enterd");
		out.println("id"+id);
		out.println("name"+name);
		out.println("sal"+sal);
		
		System.out.println("in first servlet");

	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String sal=req.getParameter("sal");
		
		PrintWriter out=resp.getWriter();
		out.println("you have enterd");
		out.println("id"+id);
		out.println("name"+name);
		out.println("sal"+sal);
		out.println("in do get");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String sal=req.getParameter("sal");
		
		PrintWriter out=resp.getWriter();
		out.println("you have enterd");
		out.println("id"+id);
		out.println("name"+name);
		out.println("sal"+sal);
		out.print("in do post");
	}
}
