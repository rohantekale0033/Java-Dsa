package Array;

import java.util.Arrays;

public class MoveNonZero {
	
	public static void main(String[] args) {
		 
		int arr[]= {0,1,0,3,12};
		
		int pos = 0;
		
	    for(int i : arr) {
	    	if(i != 0) {
	    		arr[pos]=i;
	    		pos++;
	    	}
	    }
	    
	    while(pos<arr.length) {
	    	arr[pos]=0;
	    	pos++;
	    }
	    
	    System.out.println(Arrays.toString(arr));
	     

	}

}
