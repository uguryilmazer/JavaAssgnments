package Assignments.Assigment8;

public class Question11_profit {

	public static void main(String[] args) {
		
		System.out.println(c_profits(100,100)); 

	}

	private static String c_profits(int buy, int sell) {
		int profit=sell-buy;
		String str=null;
		if(profit>0) {
			str= "profit";
		}else if(profit<0) {
			str= "loss";
		}else if(profit==0) {
			str= "no loss";
		}
		return str;
		
		
	}

}
