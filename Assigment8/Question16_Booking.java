package Assignments.Assigment8;

public class Question16_Booking {

	public static void main(String[] args) {
		
		simpleRoomBook(false,2,1,2018);
		simpleRoomBook(true,7,2,2018);
		simpleRoomBook(true,2,1,2018);
	}

	public static void simpleRoomBook(boolean b, int i, int j, int k) {
		if(k!=2018) {
			System.out.println(false);
		}else {
			if(!b) {
				System.out.println(false);
			}else {
				if(i==7&&j<9&&j>0) {
					System.out.println(false);
				}else {
					System.out.println(true);
				}
			}
		}
		
	}

}
