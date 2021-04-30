package Assignments.Assignment10;

public class Question19 {

	public static void main(String[] args) {
		java("javaxjava");
		java("javaxjavaapplepearjavaegg");
		
	
	}

	public static void java(String str) {
		int counter=0;
		for(int i=0;i<str.length()-3;i++) {
			if(str.substring(i, i+4).equals("java")) {
				counter++;
			}
			
		}
		
		System.out.println("Number of java: "+counter);
		
	}

}
/*
Return the number of times that the string "java" appears anywhere in the given string word.

Sample Output:

     input: javaxjava
     output: 2

     input: javaxjavaapplepearjavaegg
     output: 3
*/