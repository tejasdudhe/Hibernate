package com.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.model.Customer;
import com.util.HibbernateUtil;

public class MainApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op;

		SessionFactory sf = HibbernateUtil.obtainSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();

		Customer c1 = new Customer(101, "Itachi", "Uchiha", 150000.20f, "Pune");
		Customer c2 = new Customer(102, "Naruto", "Uzumaki", 50000.50f, "Mumbai");
		Customer c3 = new Customer(103, "Kakashi", "Hatake", 200000.20f, "Delhi");
		Customer c4 = new Customer(104, "monkey", "Luffy", 10000.20f, "Amravati");

		s.save(c1);
		s.save(c2);
		s.save(c3);
		s.save(c4);

		ts.commit();

		Criteria c = s.createCriteria(Customer.class);

		do {

			System.out.println("\n ********* MENU DRIVEN *********");
			System.out.println(" Enter 1 to Search BY City ?");
			System.out.println(" Enter 2 to Search By Annual Salary Range ?");
			System.out.println(" Enter 3 to Search by pattern for Last Name ?");
			System.out.println(" Enter 4 to Exit .....");

			System.out.print("\n\n Enter you Choice : ");
			op = sc.nextInt();

			switch (op) {
			case 1:

				displayBYCity(c);

				break;
				
			case 2:
				displayByRangeOfASal(c);
				break;
				
			case 3:
				displayByPatternForLName(c);
				break;
				
			case 4:
				System.out.println("\n ***** THANK YOU ********");
				break;

			default:
				System.out.println("\n Invalid Choice..........please select again");
				break;
			}

		} while (op != 4);
	}
	@SuppressWarnings("unchecked")
	public static void displayBYCity(Criteria c)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\n Enter the Name of City :");
		String city = sc.next();
		
		Criterion ctrn =  Restrictions.like("city", city);
		
		c.add(ctrn);
		
		List<Customer> lt =(List<Customer>) c.list();
		
		Iterator<Customer> itr = lt.iterator();
		while (itr.hasNext()) {
			Customer cObj = itr.next();
			System.out.println("\n "+cObj);
		}
			
		}
	
	
	@SuppressWarnings("unchecked")
	public static void displayByRangeOfASal(Criteria c)
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\n Enter the Min Range of Sal:");
			float min = sc.nextFloat();
			
			System.out.print("\n Enter the Max Range of Sal:");
			float max = sc.nextFloat();
			
			Criterion ctrn =  Restrictions.between("anuSal", min, max);
			
			c.add(ctrn);
			
			List<Customer> lt =(List<Customer>) c.list();
			
			Iterator<Customer> itr = lt.iterator();
			while (itr.hasNext()) {
				Customer cObj = itr.next();
				System.out.println("\n "+cObj);
			}
				
		}

	
	
	@SuppressWarnings("unchecked")
	public static void displayByPatternForLName(Criteria c) {
		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter the Pattern:");
		String p = sc.next();

		Criterion ctrn = Restrictions.like("lName", p, MatchMode.START);

		c.add(ctrn);

		List<Customer> lt = (List<Customer>) c.list();

		Iterator<Customer> itr = lt.iterator();
		while (itr.hasNext()) {
			Customer cObj = itr.next();
			System.out.println("\n " + cObj);

		}

	}
	
	

}
