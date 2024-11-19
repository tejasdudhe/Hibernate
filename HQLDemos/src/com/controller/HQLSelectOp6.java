package com.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HQLSelectOp6 
{
 public static void main(String[] args) 
 {
	 Configuration c=new Configuration();//load the .cfg file
		SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
			
		Session s=sf.openSession();
	
		// by name(lable) parameter
        String hql="from Employee where ename=:name"; 
		
	    Query q=s.createQuery(hql);
        
        q.setParameter("name","sumit"); 
	    Object o=q.uniqueResult();
	    
	    Employee e=(Employee)o;
	    
	    System.out.println("Employee No:"+e.getEno());
	    System.out.println("Employee Name:"+e.getEname());
	    System.out.println("Employee Salary:"+e.getEsal());

	 
 }
}
