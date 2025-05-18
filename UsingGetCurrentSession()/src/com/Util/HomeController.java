package com.Util;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;

public class HomeController {

	public static void main(String[] args) {
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session s=sf.getCurrentSession();
		
		org.hibernate.Transaction t=s.beginTransaction();
		
		Employee e=new Employee();
		
		e.setEid(1010);
		e.setEname("Rada");
		e.setSalary("90000");
		s.save(e);
		t.commit();
		System.out.println("--------------Done----------------");
	    
	}
}
