package com.client;

import java.util.Scanner;

import com.service.Employeeservice;
import com.serviceimpl.EmployeeserviceImpl;






public class Test {
   public static void main(String[]args)
   {
	   Employeeservice esi=  new EmployeeserviceImpl();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("*******MENU*******");
	   System.out.println("1.ADD_EMPLOYYEE");
	   System.out.println("2.VIEW_EMPLOYEE");
	   System.out.println("3.UPDATE_EMPLOYEE");
	   System.out.println("4.REMOVE_EMPLOYEE");
	   System.out.println("Enter Your Choice....");
	   int ch=sc.nextInt();
	   while(true)
	   {
	   switch(ch)
	   {
	   case 1:
		   esi.AddEmployee();
		   break;
		   
	   case 2:
		   esi.ViewEmployee();
		   break;
		   
	   case 3:
		   esi.UpdateEmployee();
		   break;
		   
	   case 4:
		   esi.RemoveEmployee();
		   break;
		   
		default:
			System.out.println("wrong choice");
	   }
	   }
   }


   
}
