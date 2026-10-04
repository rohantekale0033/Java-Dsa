package hashing;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		 
		int arr[]= {1, 2, 3, 4, 2};
		
		HashSet<Integer> set = new HashSet<>();
		
	    for(int i : arr) {
	    	
	    	if(set.contains(i)) {
	    		System.out.println("array contains duplicate");
	    		return;
	    	
	    	}else {
	    		set.add(i);
	    	}
	    }
	   

	}

}
