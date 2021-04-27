package Assignments.Assigment8;

public class Question15_validateTask {

	public static void main(String[] args) {
		
		validateTask(true,2,1);
		validateTask(false, 3, 2);
	}

	public static void validateTask(boolean b, int i, int j) {
		if(!b) {
			System.out.println(false);
		}else {
			if(i>j&&i<j+2) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		} 
		
	}

}
