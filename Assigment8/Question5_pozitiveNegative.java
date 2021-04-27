package Assignments.Assigment8;

import java.util.Scanner;

public class Question5_pozitiveNegative {
	
	/*
	 * Create a method called sign.  It gets a number and tells you if its positive, negative or zero.

	for example :
	sign(5) => 1
	sign(-30)=> -1
	sign(0) => 0

	sign gets an int parameter.

	print out 1,-1 or 0 depending on the input

	the parameter should be entered by user (create a scanner object)
	 */

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		sc.close();
		sign(num);

	}
	
	public static void sign(int num) {
		
		if(num>0) {
			System.out.println(1);
		}else if(num<0) {
			System.out.println(-1);
		}else {
			System.out.println(0);
		}	
		
	}

}
