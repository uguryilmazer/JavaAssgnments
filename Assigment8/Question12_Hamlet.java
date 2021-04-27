package Assignments.Assigment8;

public class Question12_Hamlet {

	public static void main(String[] args) {
		hamletQuote(true, false);	
		hamletQuote(false,true);
		hamletQuote(true,true);
		hamletQuote(false, false);
	}

	public static void hamletQuote(boolean b, boolean c) {
		if(b&&!c) {
			System.out.println(true);
		}else if(!b&&c) {
			System.out.println(true);
		}else if(b&&!c) {
			System.out.println(true);
		}else if(!b&&!c){
			System.out.println(false);
		}else {
			System.out.println(true);
		}
		
	}

}
