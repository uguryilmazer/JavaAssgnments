package Assignments.Assignment10;

public class Question17_alphabeticOrder {

	public static void main(String[] args) {
		
		alphabeticOrder('c','h');
		alphabeticOrder('A','Z');
		alphabeticOrder('B','H');
		

	}

	public static void alphabeticOrder(char a, char b) {
		for(char i=a;i<=b;i++) {
			System.out.print(i);			
		}
		System.out.println();
	}

}
/*
 * Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.

Sample Output:

     input: A
     input: Z
     output: ABCDEFGHIJKLMNOPQRSTUVWXYZ

     input: a
     input: f
     output: abcdef

     input: a
     input: d
     output: abcd

     input: B
     input: O
     output: BCDEFGHIJKLMNO
     */
