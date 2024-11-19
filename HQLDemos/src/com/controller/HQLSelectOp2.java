package com.controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class HQLSelectOp2 
{
 public static void main(String[] args) 
 {
   
	 Configuration c=new Configuration();//load the .cfg file
  	 SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
			
	 Session s=sf.openSession();
		
	 // select multiple but single column data from records. 
		
        String hql="select ename from Employee"; 
		
	    Query q=s.createQuery(hql); 
		           
	    List <String> lst=q.list();
	    
	    System.out.println("Employee Names are:");
	    for(String str:lst) // enhanced for loop
	    {
	    	System.out.println(str);
	    }
	    
	    
	    
	    
     s.close();
     sf.close();

	 
	 
	 

 }
}
