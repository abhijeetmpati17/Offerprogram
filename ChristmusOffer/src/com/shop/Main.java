package com.shop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true)
		{
			
			System.out.println("==============================================");
			System.out.println("Enter CUstomer Type ");
			System.out.println("Premium/Regular ");
			System.out.println("==============================================");
			String type=null;
			int amt=0;
			try
			{
				 type = sc.next();
				 System.out.println("Enter Billing Amt ");
				 amt = sc.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("Input Mismatch Exception plz ENter Valid Amt");
			}
			
			
			Customer c1 = new Customer();
			c1.setBillAmt(amt);
			c1.setCustomerType(type);
			c1.bill();
			System.out.println("==============================================");
		}
		
		

	}

}
