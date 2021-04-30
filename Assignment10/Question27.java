package Assignments.Assignment10;

public class Question27 {

	public static void main(String[] args) {
		
		coverString("java methods", "me");
		coverString("hello hello", "ello");
		coverString("apples", "pears");
		
	}

	public static void coverString(String str1, String str2) {
		String cover="";
		
		if(str1.contains(str2)) {
			cover= str1.replace(str2,"["+str2+"]");
					
		}else {
			cover="["+str1+"]";
		}
		
		
		System.out.println(cover);
		
	}

}

/*
coverString method will take 2 string parameters from the caller.

Your job is to write an important code that will :

- to search and find each appearance of coverME within main
- then surround it with [coverMe] (square brackets)
- if you cannot find the coverME within main after tirelessly looping then just return whole main itself covered [main].
- keep in mind that coverME value can be of any length.

Sample Output:

     coverString("java methods", "me") ) ; ==> "java [me]thods"

     coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     coverString("apples", "pears") ) ; ==> "[apples]"
*/