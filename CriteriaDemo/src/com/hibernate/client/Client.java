package com.hibernate.client;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Book;
import com.hibernate.util.HibernateUtil;





public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			SessionFactory factory=HibernateUtil.obtainSessionFactory();
			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();	//mandatory	
			
			Criteria c=session.createCriteria(Book.class);	
			
			//select only specific column
			/*Projection prj=Projections.property("title");		
			c.setProjection(prj);*/			
			
			//for multiple columns/properties
			ProjectionList plist = Projections.projectionList();
			plist.add(Projections.property("title"));
			plist.add(Projections.property("price"));
			c.setProjection(plist);		
			
			//apply some condition 
			//c.add(Restrictions.gt("price", 1000.00));
			c.add(Restrictions.between("price",1000.00,2000.00));
			c.add(Restrictions.like("author", "%S"));
				
			List<Object[]> lst=c.list();
			Iterator<Object[]> itr=lst.iterator();
			while(itr.hasNext()){
				Object[] obj=itr.next();
				System.out.println(obj[0]+" "+obj[1]);
				
			}
			
			
			txn.commit(); //here session is closed automatically
			System.out.println("Done!!");
		} catch (HibernateException e) {
			e.printStackTrace();
		}		


	}

}










