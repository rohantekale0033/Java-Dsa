package hashing;

import java.util.HashMap;

public class SubarraySumK {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int k = 3;
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		
		map.put(0,1);
		
		int currSum=0;
		int count=0;
		for(int i :arr) {
			currSum+=i;
			int needed= currSum-k;
		 if(map.containsKey(needed)) {
			 count+=map.get(needed);
		 }
			 map.put(currSum,map.getOrDefault(currSum,0)+1);
		 
		}
		System.out.println(count);
	}

}
