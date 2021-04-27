package Assignments.Assigment8;

public class Question9 {

	public static void main(String[] args) {
	int returns=max(1,10);	
	System.out.println("returns "+returns);

	}
	
	public static int max(int x, int max) {
		if(x>max) {
			return max;
		}else {
			return x;
		}
	}

}
