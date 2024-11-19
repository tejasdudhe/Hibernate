package com.controller;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.*;
import com.model.Employee;

public class HQLProjectionOp1
{
	public static void main(String[] args) 
	{
		 Configuration cf=new Configuration();//load the .cfg file
		  SessionFactory sf=cf.configure().buildSessionFactory();//create single sessionfactory
		  Session s=sf.openSession();
		
	        Criteria c=s.createCriteria(Employee.class);//2
	         // multiple records but single cols.        
	        Projection p=Projections.property("ename");
	        c.setProjection(p);
	        
	        List <String> lst=c.list();   
	                    
	        
	        System.out.println("Employee Names are:");
	        for(String str:lst)
	        {
	        	System.out.println(str);
	        }	
		    
			    	    
		     s.close();
		     sf.close();


	}

}
