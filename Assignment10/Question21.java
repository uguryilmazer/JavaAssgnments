package Assignments.Assignment10;

public class Question21 {

	public static void main(String[] args) {
		prefix("abXYabc",1);
		prefix("abXYabc",2);
		prefix("abXYabc",3);		

	}

	public static void prefix(String str, int pre) {
		int counter=0;
		int a=str.length();
		String rep=str.substring(0, pre);
		
		for(int i=0;i<=a-pre;i++) {
			if(str.contains(rep)) {
		str=str.replaceFirst(rep, "");
		counter++;
			}
			}
		if(counter>1) {
				System.out.println(true);
				System.out.println(rep+" appears "+counter+" times");
				
			}else {
				System.out.println(false);
				System.out.println(rep+" appears once only");
		}
		
	}

}

/*
Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only
*/