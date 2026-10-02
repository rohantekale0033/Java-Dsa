package string;

import java.util.HashMap;

public class CheckAnagram {

	public static void main(String[] args) {
		String s1 = "silent";
		String s2="lsiten";
		
		if(s1.length()!=s2.length()) {
			System.out.println("string are not anagrams");
			return;
			
		}
		
		 HashMap<Character,Integer> map1 = new HashMap<>();
		 HashMap<Character,Integer> map2 = new HashMap<>();
		 
		 for(int i = 0; i<s1.length(); i++) {
			 char ch = s1.charAt(i);
			 if(!map1.containsKey(ch)) {
				 map1.put(ch, 1);
			 }else {
				 map1.put( ch,  map1.get(ch)+1);
			 }
			
		 }
		 
		 for(int i = 0; i<s2.length(); i++) {
			 char ch = s2.charAt(i);
			 if(!map2.containsKey(ch)) {
				 map2.put(ch, 1); 
			 }else {
				 map2.put( ch,  map2.get(ch)+1);
			 }
			
		 }
		 
		 if(map1.equals(map2)) {
			 System.out.println("given strings are anagram");
		 }else {
			 System.out.println("given string are not anagram");
		 }

	}

}
