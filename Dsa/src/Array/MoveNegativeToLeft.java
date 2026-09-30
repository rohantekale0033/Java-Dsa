package Array;

import java.util.Arrays;

public class MoveNegativeToLeft {

	public static void main(String[] args) {
		int arr[]= {3,-2,5,-7,8,-1};
		int pos=0;
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i] < 0 ) {
				int temp = arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
				
				pos++;
			}
			
			
		}
		System.out.println(Arrays.toString(arr));
		

	}
}
