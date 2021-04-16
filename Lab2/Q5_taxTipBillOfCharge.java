package Assignments.Lab2;

import java.util.*;

public class Q5_taxTipBillOfCharge {
	
	/*Write a program that computes the tax and tip on a restaurant bill.
	The program should ask the user to enter the charge for the meal. 
	The tax should be 6.75 percent of the meal charge.
	The tip should be 20 percent of the total after adding tax.
	Display the meal charge, tax amount, tip amount, 6.75and total bill on the screen.*/
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the charge of meal:");
		
		double charge=sc.nextDouble();		
		double tax=charge*6.75/100;
		double tip=(charge+tax)*0.2;
		double totalBill=charge+tax+tip;
		
		System.out.println("Meal charge:"+charge);
		System.out.println("Tax amount:"+tax);
		System.out.println("Tip amount:"+tip);
		System.out.println("Total bill:"+totalBill);
		
	}

}
