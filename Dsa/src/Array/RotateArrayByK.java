package Array;

import java.util.Arrays;

public class RotateArrayByK {
	public static void main(String args[]) {
	int arr[]= {1,2,3,4,5,6,7};
	int k = 2;
	
	int n = arr.length;
	 
	k = k%n; // if k is greater than n 
	
	int temp[]=new int[k];
	
	for (int i = 0 ; i<k ; i++) {
		temp[i] = arr[n-k+i];
	}
	
	for(int i = n-1 ; i>=k ; i--) {
		arr[i]=arr[i-k];
		
	}
	
	for (int i = 0 ; i<k;i++) {
		arr[i]=temp[i];
	}
	
	System.out.println(Arrays.toString( arr));
	
	 
}
	}
