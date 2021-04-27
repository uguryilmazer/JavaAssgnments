package Assignments.Assigment8;

import java.util.Scanner;

public class Question2_cube {

	public static void main(String[] args) {
		
	cube();
	}
	public static void cube() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();sc.close();
		int cube=num*num*num;
		System.out.println(cube);
	}	

}

/*
Create a method called cube. Write all required code inside this method in order to 
ask the user for a number and then prints the cubed value of that number:

Example:
input: 5
output: 125
*/