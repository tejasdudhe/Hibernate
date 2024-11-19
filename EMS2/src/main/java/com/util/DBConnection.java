package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection 
{
	public SessionFactory getSessionFactory()
	  {
		  Configuration c= new Configuration();
		  SessionFactory sf=c.configure().buildSessionFactory();
		  return sf;
	  }
}
