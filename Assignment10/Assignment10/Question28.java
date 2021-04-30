package Assignments.Assignment10;

public class Question28 {

	public static void main(String[] args) {
		clean("one two three","two");
		 clean ("foo bar","foo");
		 clean ("he said bla bla bla","bla");

	}

	public static void clean(String str1, String str2) {
		
		System.out.println(str1.replaceAll(str2, "").trim());
		
		
		
		
	}

}


/*
This method gets two strings (text and badWord) and returns a string. 
Basicly what it does is take out all the occurrences of badWord in text.

Sample Output:

     clean ("one two three","two")
     returns "one three"

     clean ("foo bar","foo")
     returns "bar"

     clean ("he said bla bla bla","bla")
     returns "he said "
*/