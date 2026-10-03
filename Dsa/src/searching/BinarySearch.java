package searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 45};
		int target = 23;
		
		int left =0;
		int right=arr.length-1;
		
		
		while(left<=right) {
			int mid=  left+(right-left)/2;
			
			if(arr[mid]==target) {
				System.out.println("target is at index  "+mid);
				return;
			}
			
			else if(arr[mid]>target) {
				
				right=mid-1;
				 
			}
			else {
				
				left=mid+1;
			}
			
			 
		}
	}

}
