package Assignments.Assignment10;

public class Question24 {

	public static void main(String[] args) {
		String s1="We study java not python";
		String s2="java"	;	
		String s3="python";
		
		
		
		if(countString(s1,s3)==countString(s1,s2)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
			
		
		

	}

	public static int countString(String str1,String str2) {
		int count=0;
		while(str1.contains(str2)) {
			str1=str1.replaceFirst(str2, "");
			count++;
		}
		return count;
		
		
	}

}



/*
Given a string, print out true if the number of appearances of "java" anywhere in the string
 is equal to the number of appearances of "python" anywhere in the string (case sensitive).

Sample Output:

     input: We study java not python
     output: true

     input: What's the difference between java, javascript and python?
     output: false
*/