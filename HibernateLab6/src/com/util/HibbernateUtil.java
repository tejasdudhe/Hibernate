package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibbernateUtil 
{
	public static SessionFactory obtainSessionFactory() {

		Configuration con = new Configuration();
		SessionFactory sf = con.configure().buildSessionFactory();
		return sf;
	}
}
