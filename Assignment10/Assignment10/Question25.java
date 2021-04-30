package Assignments.Assignment10;

public class Question25 {

	public static void main(String[] args) {
		
		String s1="12345";
		String s2="abc";
		
		mergeStrings(s1,s2);
		mergeStrings("wooden", "spoon");
	    mergeStrings("java", "selenium") ;
		

	}

	public static void mergeStrings(String s1, String s2) {
		int a=s1.length();
		int b=s2.length();
		String merge="";
		int i=0;
		if(a>b) {
			for( i=0;i<b;i++) {
				merge+=""+s1.charAt(i)+s2.charAt(i);
			}
			System.out.println(merge+s1.substring(b));
		}else if(a<b) {
			for( i=0;i<a;i++) {
				merge+=""+s1.charAt(i)+s2.charAt(i);
			}
			System.out.println(merge+s2.substring(a));
		
		}else if(a==b){
			for( i=0;i<a;i++) {
				merge+=""+s1.charAt(i)+s2.charAt(i);
			}
			System.out.println(merge);
						
		}		
		
	}

}


/*
When gears merge and work together, one tooth from each one goes in order.
Write a method mergeStrings that will return the strings merged, one letter at a time, starting with one. 
Please note one and two can be of different lengths. Please look at below examples:

     s1 ==> "12345"
     s2 ==> "abcde"
     mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     mergeStrings("java", "selenium") ==> "jsaevlaenium"
*/