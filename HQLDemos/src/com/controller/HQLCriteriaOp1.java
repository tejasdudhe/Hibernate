package com.controller;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.model.Employee;
public final class HQLCriteriaOp1 
{
  public static void main(String[] args) 
  {

	  Configuration cf=new Configuration();//load the .cfg file
	  SessionFactory sf=cf.configure().buildSessionFactory();//create single sessionfactory
	  Session s=sf.openSession();
	    //1
        Criteria c=s.createCriteria(Employee.class);// 
        //2          
       Criterion cr=Restrictions.eq("eno",101);
        //3
       c.add(cr);
           
        Object o=c.uniqueResult();            
        
        System.out.println("Employee Details are:");
	     Employee e=(Employee)o; 
        	    
	     System.out.println("Employee No:"+e.getEno());
	 	 System.out.println("Employee Name:"+e.getEname());
	 	 System.out.println("Employee Salary:"+e.getEsal());
	    	
	    
		    	    
	     s.close();
	     sf.close();


	  
	  
	  
  }
}
