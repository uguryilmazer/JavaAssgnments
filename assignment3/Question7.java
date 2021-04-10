package Assignments.assignment3;

public class Question7 {

	public static void main(String[] args) {
		
		int price=95;
		int dispense=100-price;
		int quarters=dispense/15;
		int dimes= (dispense%15)/10;
		int nickles= (dispense%10)/5;
		
		System.out.println("Your change is "+quarters+" quarter, "+dimes+" dimes, and "+nickles+" nickles");

	}

}
