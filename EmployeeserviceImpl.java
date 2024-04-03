package com.serviceimpl;

import java.util.Scanner;




import org.hibernate.Session;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Employee;
import com.service.Employeeservice;
import com.model.*;

public class EmployeeserviceImpl implements Employeeservice {

	@Override
	public void AddEmployee() {
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter ID:-");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Name:-");
		e.setName(sc.next());
		System.out.println("Enter Employee Desiganation:-");
		e.setDesignation(sc.next());
		System.out.println("Enter Employee Salary");
		e.setSalary(sc.nextDouble());
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx= session .beginTransaction();
		session.save(e);
		tx.commit();
		
		
	}

	@Override
	public void ViewEmployee() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID:-");
		int eid=sc.nextInt();
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Employee e=session.get(Employee.class, eid);
		if(e!=null)
		{
			System.out.println(e.getEid());
			System.out.println(e.getName());
			System.out.println(e.getDesignation());
			System.out.println(e.getSalary());
		
		}
		else {
			System.out.println("Invalid Employee Id.");
		}
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateEmployee() {
		System.out.println("Update employee Details");
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		System.out.println("Enter ID:-");
		e.setEid(sc.nextInt());
		System.out.println("Enter Employee Name:-");
		e.setName(sc.toString());
		System.out.println("Enter Employee Desiganation:-");
		e.setDesignation(sc.next());
		System.out.println("Enter Employee Salary");
		e.setSalary(sc.nextDouble());
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.update(e);
		tx.commit();
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee:");
		int eid=sc.nextInt();
		//Employee e= new Employee();
		//e.setEid(eid);
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction tx = session .beginTransaction();
		Employee e2=session.get(Employee.class, eid);
		if(e2!=null) {
		session.delete(e2);
		tx.commit();
		}
		else {
			System.out.println("invalid Employee ID");
		}
		
		
		// TODO Auto-generated method stub
		
	}
	
	

}
