package Assignments.Assigment8;

public class Question8_fibonacci {

	public static void main(String[] args) {
		/*
         * Complete a method fib() that will compute Fibonacci numbers In fibonacci
         * series, next number is the sum of previous two numbers for example 
         * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci
         * series are 0 and 1. Given a number num, print n-th Fibonacci Number.
         * Input : 2 Output : 1
         * Input : 9 Output : 21
         */
		
		System.out.println(fib(9));
		

	}
		public static int fib(int num) {
    		int firstNum=0;
    		int secondNum=1;
    		int thirdNum=0;
    
    		for(int i=1; i<num ;i++) {
    			firstNum=secondNum;
    			secondNum= thirdNum;
    			thirdNum=secondNum+firstNum;
    		}
    			return thirdNum;
		}	

}
