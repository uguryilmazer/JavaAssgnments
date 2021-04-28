package Assignments.Assignment10;

public class Question26 {

	public static void main(String[] args) {
		
		uniqueChars("java");
		uniqueChars("mama");
	     uniqueChars("spoon") ;
		
	}

	public static void uniqueChars(String str) {
		String unique="";
		for(int i=0;i<str.length();i++) {
			if(!unique.contains(str.substring(i, i+1))) {
				unique=unique+str.charAt(i);
			}
			
		}
		System.out.print(unique);
		System.out.println();
		
		
	}

}


/*
uniqueChars is a method that you will code now, 
should be able to accept any string in the word and return unique characters from the parameter.

Sample Output:

     uniqueChars("java") ==> "jav"

     uniqueChars("mama") ==> "ma"

     uniqueChars("spoon") ==> "spon
*/