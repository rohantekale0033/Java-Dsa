package searching;

public class SearchInRoatedSorted {

	public static void main(String[] args) {
		int[] arr = {4, 5, 6, 7, 0, 1, 2};
		int target = 0;
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int mid = left+(right-left)/2;
			
			if(target==arr[mid]) {
				System.out.println("element is at index  " + mid);
			}
			
			if(arr[left]<arr[mid]) {
				if(target>=arr[left] && target<arr[mid]) {
					right=mid-1;
				}else {
					left=mid+1;
				}
			}else {
				if(target>=arr[mid] && target<arr[right]) {
					left=mid+1;
				}else {
					right=mid-1;
				}
			}
			
			 
		 }

	}

}
