package hashing;

import java.util.HashMap;

public class CountFrequencyOfElement {

	public static void main(String[] args) {
		 
		int arr[] = {2, 3, 2, 5, 3, 2};
		
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i : arr) {
			
			if(!map.containsKey(i)) {
				map.put( i, 1);
			}else {
				 map.put( i, map.get(i)+1);
			}
		}
		System.out.println(map);

	}

}
