package com.contoller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.model.*;
public class MainApp 
{
 public static void main(String[] args) 
	{
	 Configuration  c= new Configuration();
	 SessionFactory sf= c.configure().buildSessionFactory();
	 Session s=sf.openSession();
	 Transaction t= s.beginTransaction();
	 
	 Employee e1= new Employee(101,"Amit",12000);
	 
	 s.save(e1);
	 t.commit();
	 s.close();
	 sf.close();		
	}//end main
}//end class
