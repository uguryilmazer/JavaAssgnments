package Assignments.Assigment8;

public class Question4_Rectangle {

	public static void main(String[] args) {
		/*
	     * Create a method printHollowRect that prints a 5 on 5 hollow rectangle: hint:
	     * you will need to use two nested for loops for that, and an if that checks if
	     * its the last or first iteration of the loop (so you will know when to print
	     * "*" or " ")
	     */
		
		int row=5;
		int i,j;
		
		for(i=0;i<row;i++) {			
			
			for(j=0;j<row;j++) {
				
				if(i==0||j==0||j==row-1||i==row-1) {
					System.out.print("*");
			
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");			
		}
		

	}

}
