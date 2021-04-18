package Assignments.Lab2;

import java.util.Scanner;

public class Q3_SumOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a psitive number:");
		int sum=0;
		
		int num=sc.nextInt();
		
		if(num>0) {
			for(int i=num;i>0;i--) {
			 sum=sum+i;
			} 
			System.out.print(sum);
			
		}else {
			System.out.print("Invalid number");
		}
		

	}

}
