package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.util.DBConnection;

public class EmpDao 
{
	public int addEmp(Employee e)
	  {
		DBConnection con= new DBConnection();
		SessionFactory sf=con.getSessionFactory();
		Session s=sf.openSession(); 
		Transaction t= s.beginTransaction();
		s.save(e);
		t.commit();
		s.close();
		return 1;
	  }
}
