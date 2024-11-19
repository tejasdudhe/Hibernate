package com.controller;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.model.*;
public class HQLCpytbl 
{
 public static void main(String[] args) 
 {
	
		Configuration c=new Configuration();//load the .cfg file
		SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
			
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String hql="insert into NewEmp(eno,ename,esal) select e.eno,e.ename,e.esal from Employee e"; 
		
	    Query q=s.createQuery(hql); 
		  
	    int i=q.executeUpdate();
	    
	    System.out.println(i+"No of records updated..!!");
	    
        t.commit();
        s.close();
        sf.close();
 
 }
}
