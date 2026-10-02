package string;

import java.util.HashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		 String s = "programming";
		 HashSet<Character> set = new HashSet<>();
		 
		 StringBuilder result = new StringBuilder();
		 for(int i =0 ; i<s.length(); i++) {
			 char ch = s.charAt(i);
			 if(!set.contains(ch)) {
				 set.add(ch);
				 result.append(ch);
			 }
		 }
		 System.out.println(result);
	}

}
