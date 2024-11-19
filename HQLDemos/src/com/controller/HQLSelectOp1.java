package com.controller;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.model.Employee;
public class HQLSelectOp1 
{
 public static void main(String[] args) 
 {
		Configuration c=new Configuration();//load the .cfg file
		SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
		Session s=sf.openSession();
		
		// One row/Record select operation
		
        String hql="from Employee where eno=102"; 
		
	    Query q=s.createQuery(hql); 
	    
	    
		           
	    Employee e=(Employee)q.uniqueResult(); // only for single record/row
	    
	    //Employee e=(Employee)o;
	    
	    System.out.println("Employee No:"+e.getEno());
	    System.out.println("Employee Name:"+e.getEname());
	    System.out.println("Employee Salary:"+e.getEsal());
   
        s.close();
        sf.close();
  
		


 }
}
