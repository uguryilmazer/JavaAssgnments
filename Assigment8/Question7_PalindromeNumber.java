package Assignments.Assigment8;

public class Question7_PalindromeNumber {

	public static void main(String[] args) {
		/*
	     * Complete a method isPalindrome() that will check if the number is a
	     * palindrome. Print your result as a boolean (true or false). Do not convert
	     * int into a string! Example: input: 1001 output: true
	     * 
	     * Example: input: 1234 output: false
	     */		
		
		isPalindrome(1001);

	}
	public static void isPalindrome(int n) {

	    int reminder;
	    int reversed = 0;
	    int dummy=n;

	    while(n!=0)
	    {
	        reminder = n % 10;
	        reversed = reversed * 10 + reminder;
	        n = n / 10;
	    }
	    if (dummy==reversed) {
	        System.out.println(true);
	    }else
	        System.out.println(false);
	}

}
