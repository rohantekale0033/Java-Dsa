package Array;

import java.util.Arrays;

public class RemoveDuplicatesSorted {
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,3,4,4,5};
		int pos=0;
		
		for(int i = 1; i<arr.length; i++) {
			
			if(arr[i] != arr[pos]) {
				pos++;
				arr[pos]=arr[i];
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
