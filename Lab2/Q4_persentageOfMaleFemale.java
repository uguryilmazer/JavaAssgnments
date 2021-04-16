package Assignments.Lab2;

import java.util.Scanner;

public class Q4_persentageOfMaleFemale {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of males: ");
		int male=sc.nextInt();
		System.out.print("Enter number of females: ");
		int female=sc.nextInt();
		int perM=male*100/(male+female);
		int perF=female*100/(male+female);
		
		System.out.println("Percentage of males: %"+perM);
		System.out.println("Percentage of males: %"+perF);
	}
		
}
