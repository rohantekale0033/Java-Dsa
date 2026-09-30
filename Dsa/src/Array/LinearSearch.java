package Array;

public class LinearSearch {

	public static void main(String[] args) {
		 
		int[] arr = {10, 25, 7, 42, 18};
		int target = 402;
		
		for(int i = 0 ; i<arr.length ; i++) {
			
			if(arr[i] == target) {
				System.out.println(target + "   is present at index  " + i);
				return;
			}
			
		}
		  System.out.println(-1);
		

	}

}
