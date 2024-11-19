package com.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HQLSelectOp4 
{
	public static void main(String[] args) 
	{
		Configuration c=new Configuration();//load the .cfg file
		SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
			
		Session s=sf.openSession();
		
		// One row/Record select operation  with setting parameter
		// by index
        String hql="from Employee where eno=?"; 
		
	    Query q=s.createQuery(hql);
	    
	    q.setParameter(0,102); 
		           
	    Object o=q.uniqueResult();
	    
	    Employee e=(Employee)o;
	    
	    System.out.println("Employee No:"+e.getEno());
	    System.out.println("Employee Name:"+e.getEname());
	    System.out.println("Employee Salary:"+e.getEsal());
	    
        s.close();
        sf.close();

	}

}
