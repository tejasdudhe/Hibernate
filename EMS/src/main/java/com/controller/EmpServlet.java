package com.controller;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.bean.*;
import com.dao.*;
public class EmpServlet extends HttpServlet 
{
    public EmpServlet() 
    {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int eid=Integer.parseInt(request.getParameter("eid"));
		String ename=request.getParameter("ename");
		int esal=Integer.parseInt(request.getParameter("esal"));
		
		RequestDispatcher rd1=request.getRequestDispatcher("./mastermenu");
		RequestDispatcher rd2=request.getRequestDispatcher("./addemp");
		
		PrintWriter out= response.getWriter();
		
		Employee e= new Employee();
		e.setEid(eid);
		e.setEname(ename);
		e.setEsal(esal);
		
		EmpDao edao=new EmpDao();
		
		int i=edao.addEmp(e);
		if(i>0)
		{
			out.print("<br> Record Added Successfully...!!!");
			rd1.include(request, response);
		}
		else
		{
			out.print("<br> Record Denined...!!!");
			rd2.include(request, response);
		}	
	}
}//end class
