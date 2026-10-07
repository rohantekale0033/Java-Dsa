package patterns;

public class TwoSum {
	
	static boolean twoSum(int arr[],int target) {
		
		int left=0;
		int right=arr.length-1;
		
		while(left<=right) {
			int sum = arr[left]+arr[right];
			if( sum==target) {
				return true;
			}
			
			if(sum<target) {
				left++;
			}
			
			if(sum>target) {
				right--;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		 int arr[]= {1,2,4,6,8,9};
		 int target=50;
		 System.out.println(twoSum(arr,target));  
	}

}
