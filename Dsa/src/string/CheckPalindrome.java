package string;

public class CheckPalindrome {

	public static void main(String[] args) {
		 String s = "NOON";
		 
		 int left=0;
		 int right=s.length()-1;
		 
		 while(left<right) {
			if( s.charAt(left)!=s.charAt(right)) {
				System.out.println("not a palindrome");
				 return;
			}
			left++;
			right--;
			
		 }
		 System.out.println("string is palindrome");
	}

}
