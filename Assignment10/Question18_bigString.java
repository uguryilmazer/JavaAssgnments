package Assignments.Assignment10;

public class Question18_bigString {

	public static void main(String[] args) {
		bigString("Word","X",3);
		bigString("This","And",2);
		bigString("This","And",1);
		
		

	}

	public static void bigString(String string, String string2, int i) {
		
		for(int j=0;j<i;j++) {
			System.out.print(string);
			if(j<i-1){
				System.out.print(string2);
			}
			
		}
		System.out.println();
	}

}

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.

Sample Output:

     input: Word
     input: X
     input: 3
     output: WordXWordXWord

     input: This
     input: And
     input: 2
     output: ThisAndThis

     input: This
     input: And
     input: 1
     output: This
*/