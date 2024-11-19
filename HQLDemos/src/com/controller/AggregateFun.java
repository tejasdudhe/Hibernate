package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AggregateFun 
{
  public static void main(String[] args) 
  {
	  Configuration c=new Configuration();//load the .cfg file
	  SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
	  Session s=sf.openSession();
	
	     //use of aggregate functions =>max, min , avg ,count , sum 
			
	     String hql=" select avg(esal) from Employee"; 
			
		 Query q=s.createQuery(hql); 
			           
		 double avg=(Double)q.uniqueResult(); 
		    
		 System.out.println("Average Salary is:"+avg);
		    	    
	     s.close();
	     sf.close();

	  
	  
	  
  }
}
