package com.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.model.*;

public class Test 
{
	public static void main(String[] args) 
	{
	
		Configuration c=new Configuration();//load the .cfg file
		SessionFactory sf=c.configure().buildSessionFactory();//create single sessionfactory
			
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
	    Employee e1=new Employee(101,"amit",15000);
		Employee e2=new Employee(102,"sumit",25000);
		Employee e3=new Employee(103,"ajit",35000);
		
		session.save(e1);
		session.save(e2);
		session.save(e3);
		
		
		t.commit();
		session.close();
		sf.close();
	}
}
