package string;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		 
		String s = "abcabcbb";
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int maxLength = 0;
		
		for(int i =0; i<s.length(); i++) {
			char ch  = s.charAt(i);
			if(!set.contains(ch)) {
				set.add( ch);
				
				int length = i-left+1;
				if(length>maxLength) {
					maxLength=length;
				}else {
					set.remove(s.charAt(left));
					left++;
					
				}
				
			}
		}
		System.out.println(maxLength);

	}

}
