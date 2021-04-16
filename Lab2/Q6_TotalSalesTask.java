package Assignments.Lab2;

import java.util.Scanner;

public class Q6_TotalSalesTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the amount of purchase:");
		double amount=sc.nextDouble();
		double stateSalesTax=amount*0.04;
		double countySalesTax=amount*0.02;
		double totalSalesTax=stateSalesTax+countySalesTax;
		double totalAmount=totalSalesTax+amount;
		
		System.out.println("Amount of the purchase:"+amount);
		System.out.println("The state sales tax:"+stateSalesTax);
		System.out.println("The county sales tax:"+countySalesTax);
		System.out.println("The total sales tax:"+totalSalesTax);
		System.out.println("The total of the sale:"+totalAmount);
		

	}

}
