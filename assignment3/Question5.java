package Assignments.assignment3;

public class Question5 {

	public static void main(String[] args) {
		
		int inputSecond=3695;
		int seconds=inputSecond%60;
		int minutes=(inputSecond%3600)/60;
		int hours= inputSecond/3600;
		System.out.println(hours+ " hours, "+minutes+" minutes, and "+seconds+" seconds");

	}

}
