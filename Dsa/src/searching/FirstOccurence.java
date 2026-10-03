package searching;

public class FirstOccurence {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 3, 4, 5};
		int target = 6;
		
		int left=0;
		int right = arr.length-1;
		
		int first=-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			if(arr[mid]==target) {
				 first = mid;
				 right=mid-1;
			}else if(target<arr[mid]) {
				right=mid-1;
			}else {
				left=mid+1;
			}
			
			
		}
		System.out.println(first);
		

	}

}
