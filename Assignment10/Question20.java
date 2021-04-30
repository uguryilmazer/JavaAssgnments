package Assignments.Assignment10;

public class Question20 {

	public static void main(String[] args) {
		factorial(5);
		

	}

	public static void factorial(int i) {
		int num=5;
		int f=1;
		for( i=num;i>0;i--) {
			f*=i;
		}
		System.out.println(f);
		
	}

}


/*
In mathematics, the factorial of a positive integer n, denoted by n!,  
is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Sample Output:
     input: 5
     output: 120
*/