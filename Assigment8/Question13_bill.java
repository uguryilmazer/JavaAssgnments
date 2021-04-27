package Assignments.Assigment8;

public class Question13_bill {

	public static void main(String[] args) {
		
		waterTax(151);
		waterTax(50);
	}

	public static void waterTax(double i) {
		double returns=0;
		if(i<=50) {
			 returns=i*0.6;
			 System.out.println(returns);
		}else if(i>50&&i<=100) {
			 returns=i*0.9;
			 System.out.println(returns);
		}else if(i>100&&i<=150) {
			 returns=i*0.9+50;
			 System.out.println(returns);
		}else if(i>150) {
			 returns=i*0.9+100;	
			 System.out.println(returns);
		}	
			
			
	}


}