package Assignments.Lab2;

import java.util.Scanner;

public class Q2_calorieOfCookies {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of cookies:");
		int cookies=sc.nextInt();
		int calOfCookie=30;
		int totalCal=calOfCookie*cookies;
		System.out.println("The number of total calories: "+totalCal);
	}

}
