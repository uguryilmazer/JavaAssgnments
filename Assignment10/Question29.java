package Assignments.Assignment10;

public class Question29 {

	public static void main(String[] args) {
		limit("abcd",2);
		limit("bla bla",3);
	}

	public static void limit(String str, int i) {
		
		String returns="";
		for(int j=0;j<i;j++) {
			returns=returns+str.charAt(j);
		}
		System.out.println(returns);
		
		
	}

}
/*
This method gets a string and an int, it returns a string. 
What it does is to limit the inputted string to a creating number of characters.

Sample Output:

     limit("abcd",2)
     returns "ab"

     limit("bla bla",3)
     returns "bla"
*/