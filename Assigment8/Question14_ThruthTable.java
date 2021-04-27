package Assignments.Assigment8;

public class Question14_ThruthTable {

	public static void main(String[] args) {
		ThruthTable(true,false,false);

	}

	public static void ThruthTable(boolean b, boolean c, boolean d) {
		if(b&&c) {
			System.out.println(true);
		}else if(d) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
	}

}
