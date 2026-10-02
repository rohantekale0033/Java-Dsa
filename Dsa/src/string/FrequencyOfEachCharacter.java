package string;

import java.util.HashMap;

public class FrequencyOfEachCharacter {

	public static void main(String[] args) {
		 String s = "banana";
		 
		  HashMap<Character,Integer> map = new HashMap<>();
		  
		  for(int i =0; i<s.length(); i++) {
			  char ch = s.charAt(i);
			  
			  if(!map.containsKey(ch)) {
				  map.put(ch, 1);
			  }else {
				  map.put( ch, map.get(ch) + 1);
			  }
		  }
		  
		  System.out.println(map);

	}
 
}
