package patterns;

public class MinimumSizeSubarraySum {
	
	static int minSubarrayLength(int arr[],int target) {
		int left=0;
		int sum=0;
		int right=0;
		int minLength=Integer.MAX_VALUE;
		
		while(right<arr.length) {
			
			sum+=arr[right];
			right++;
			
			while(sum>=target) {
			int length = right-left;
			minLength=Math.min(length, minLength);
			sum-=arr[left];
		 	left++;
			}
			
		}
		if(minLength==Integer.MIN_VALUE) {
			return 0;
		}
		
		  return minLength;
		
	}

	public static void main(String[] args) {
		 int arr[]= {2,3,1,2,4,3};
		 int target = 7; 
		System.out.println(minSubarrayLength(arr, target)); 

	}

}
