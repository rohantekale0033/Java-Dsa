package Array;

import java.util.Arrays;

public class PerefixSum {

	public static void main(String[] args) {
		 int arr[]= {2,4,1,3,5};
		 int l = 1;
		 int r = 2;	 
		 
		 int prefix[]=new int [arr.length];
		 
		 prefix[0]=arr[0];
		 
		 for(int i = 1 ; i<arr.length ; i++ ) {
			 prefix[i]= prefix[i-1]+arr[i];
		 }
		 System.out.println(Arrays.toString(prefix));
		 
		 int rangeSum= prefix[r]-prefix[l-1];
		 System.out.println(rangeSum);
		 
		 

	}

}
