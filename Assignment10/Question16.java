package Assignments.Assignment10;

public class Question16 {

	public static void main(String[] args) {
		
		java("j");
		java("javapython");
		java("cjavac++");
		java("c#javaruby");
		
		
		}
	
	public static void java(String str) {
		if(str.length()>=4) {
			if(str.substring(0, 4).equals("java")||str.substring(1, 5).equals("java")){
				System.out.println(true);
				}else {
					System.out.println(false);
				}
			}else {
			System.out.println("Invalid word");
				
			}
	}
	

}

/*Given a string word, print true if "java" appears starting at index 0 or 1 in the string, 
 * such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more characters.

	Sample Output:
     input: javapython
     output: true

     input: cjavac++
     output: true

     input: c#javaruby
     output: false
 
 */









