package Assignments.Lab2;

import java.util.Scanner;

public class Question_1_largest$Smallest_number {

	 public static void main(String[] args) {
	        Scanner userInput = new Scanner(System.in);
	        System.out.print("Enter your first number");
	        int num = userInput.nextInt();
	        int largest = num;
	        int smallest = num;

	        int go = 1;
	        while (go == 1) {
	            System.out.print("Enter the next number.");
	            num = userInput.nextInt();
	            System.out.print("Do you want to enter a new number? 0-No, 1-Yes");
	            go = userInput.nextInt();
	            if (num > largest) {
	                largest = num;
	            }
	            if (num < smallest) {
	                smallest = num;
	            }

	        }
	        System.out.println();
	        System.out.println("The greatest number is: " + largest);
	        System.out.println("The smallest number is: " + smallest);

	    

	

	}

}
