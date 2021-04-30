package Assignments.Assignment10;

public class Question31 {

	public static void main(String[] args) {
		isPalindrome("Noon");
		isPalindrome("I am not palindrome");
		isPalindrome("wooden");
		isPalindrome("Nurses Run");
		

	}

	public static void isPalindrome(String str) {
		String pal="";
		for(int i=str.length()-1;i>=0;i--) {
			pal=pal+str.charAt(i);			
		}
		System.out.println(pal.replace(" ", "").toLowerCase());
		if(pal.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
/*
 * Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.
So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive. ex: Civic and civic are both palindromes
- make your conditions space insensitive. Race car is a palindrome even though there is space in between.

Sample Output:
     isPalindrome("Noon") ==> true
     isPalindrome("I am not palindrome") ==> false
     isPalindrome("wooden") ==> false
     isPalindrome("Nurses Run") ==> true
     */