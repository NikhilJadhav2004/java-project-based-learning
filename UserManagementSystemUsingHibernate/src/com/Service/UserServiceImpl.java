package com.Service;

import java.security.Provider.Service;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.Entity.Employee;
import com.Util.HibernateUtil;

public class UserServiceImpl implements UserService{

	Scanner sc=new Scanner(System.in);
	
	Employee emp=new Employee();
	
	SessionFactory	sf=HibernateUtil.getSessionFactory();
	
	@Override
	public void createUser() {
		
		Session s=sf.openSession();
		System.out.println("Enter the eid");
		
		emp.setEid(sc.nextInt());
		
		System.out.println("Enter the ename");
		
		emp.setEname(sc.next());
		
		System.out.println("Enter the eAddress");
		
		emp.seteAddress(sc.next());
		
		s.save(emp);
		
		s.beginTransaction().commit();
		System.out.println("Data Susessfully Insert");
		
	}

	@Override
	public void UpdateUser() {
		Session s = sf.openSession();
		System.out.println("update your Data");
		
		System.out.println("1.ename");
		System.out.println("2.eaddress");
		System.out.println("3.exit");

		System.out.println("enter the eid");
		int id = sc.nextInt();
        
		Employee e=s.get(Employee.class, id);
		
		if (id == e.getEid()) {

			boolean flag = true;
			System.out.println("enter the choise");
			int choise = sc.nextInt();

			while (flag) {

				switch (choise) {
				case 1:
					System.out.println("Enter new name");
					String name = sc.next();
   
					Employee e1=s.get(Employee.class, id);
					e1.setEname(name);
					s.update(e1);
					s.beginTransaction().commit();

					System.out.println("data susessfully updated");

				flag=false;
					break;
					

				case 2:
					System.out.println("Enter new Address");
					String add = sc.next();
					Employee e2=s.get(Employee.class, id);
					e2.seteAddress(add);
					
					s.update(e2);
					s.beginTransaction().commit();

					System.out.println("data susessfully updated");
					break;
					

				case 3:
					flag = false;

					System.out.println("Exit");
					break;
				
				default:
					System.out.println("enter the valid choise");
					break;

				}

			}

		} else {
			System.out.println("enter the valid id");
		}

	}

	@Override
	public void DeleteUser() {
		
		Session s=sf.openSession();
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		Employee e=s.get(Employee.class, id);
		
		if(id==e.getEid()) {
			
			s.delete(e);
			System.out.println("Data Sucessfully Delete");
			s.beginTransaction().commit();
			
		}
		else {
			System.out.println("Enter the valied id");
		}
	}

	@Override
	public void GetUserInfo() {
		
        Session s=sf.openSession();
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		Employee e=s.get(Employee.class, id);
		
		System.out.println(e);
	}

	
}
