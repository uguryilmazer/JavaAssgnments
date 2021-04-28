package Assignments.Assignment10;

public class Q31 {

	public static void main(String[] args) {
		System.out.println(isPalindrome("Ebe"));

    }

    public static boolean isPalindrome(String str) {
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            
            result += str.charAt(i);

        }
        str=str.replace(" ", "").toLowerCase();
        result=result.replace(" ", "").toLowerCase();
        
        return result.equalsIgnoreCase(str);
	}

}
