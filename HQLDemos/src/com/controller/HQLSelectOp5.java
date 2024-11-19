package com.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HQLSelectOp5 
{
	public static void main(String[] args) 
	{
		Configuration c=new Configuration();//load the .cfg file
		SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
			
		Session s=sf.openSession();
		
		// Parameter binding in hibernate. use java variable name in hql
		//by variable parameter 
		String name="sumit";
		
        String hql="from Employee where ename='"+name+"'"; 
		
	    Query q=s.createQuery(hql);
	  	  		           
	    Object o=q.uniqueResult();
	    
	    Employee e=(Employee)o;
	    
	    System.out.println("Employee No:"+e.getEno());
	    System.out.println("Employee Name:"+e.getEname());
	    System.out.println("Employee Salary:"+e.getEsal());
	  
	}

}
