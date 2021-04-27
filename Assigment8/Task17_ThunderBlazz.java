package Assignments.Assigment8;

public class Task17_ThunderBlazz {

	public static void main(String[] args) {
		getThunderBlazz(true,false,1,2,3);
		getThunderBlazz(false,false,1,2,3);
		getThunderBlazz(false,false,1,5,3);
		getThunderBlazz(false,false,3,1,2);
		getThunderBlazz(false,false,3,1,1);
		getThunderBlazz(false,true,9,7,3);

	}

	public static void getThunderBlazz(boolean b, boolean c, int i, int j, int k) {
		if(b) {
			System.out.println(true);
		}else {
			if(c) {
				System.out.println(true);
			}else {
				if(i==1&&j==2&&k==3) {
					System.out.println(true);
				}else if(i==3&&j==1&&k==2) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
		}
		
		
	}

}
