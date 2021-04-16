package Assignments.Lab2;

import java.util.Scanner;

public class Q3_SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a psitive number:");
		
		int g=1;		
		int sum=0;
		for(int i=1;i==g;i++) {
			int num=sc.nextInt();
			if(num>0) {		
				sum=sum+num;
				System.out.println("Sum of your numbers: "+sum);g++;
				System.out.print("Enter your number :");
			}else {
				System.out.print("Invalid number, enter a positive number: ");
				g++;
				
			}
		}

	}

}
