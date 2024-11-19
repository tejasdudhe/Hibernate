package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLSelectOp3 
{
  public static void main(String[] args) 
  {
	     Configuration c=new Configuration();//load the .cfg file
	  	 SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
		 Session s=sf.openSession();
		 // select multiple column data from records. 
			
	        String hql="select ename,esal from Employee"; 
			
		    Query q=s.createQuery(hql); 
			           
		    List <Object> lst=q.list();
		    
		    System.out.println("Employee Names and salary are:");
		    
		    for(Object o:lst)
		    {
		    	// foreach object it will return object array 
		    	Object ar[]= (Object [])o; 
		    	for(Object e:ar)
			    {	
		      	  	System.out.println(e);
		    	  	
			    } 	
		    }
		    
		    System.out.println("Employee Names and salary are:");
		    for(Object o:lst)
		    {
		    	Object ar[]= (Object [])o;
		    	System.out.print(ar[0]+" ");
		    	System.out.println(ar[1]);
		    }	
		  		    
	     s.close();
	     sf.close();
	 }
}
