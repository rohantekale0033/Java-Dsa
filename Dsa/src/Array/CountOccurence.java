package Array;

public class CountOccurence {

	public static void main(String[] args) {
		int arr[]= { 0,4,6,8,2,1,2,1,6,2};
		int target = 6;
		int count=0;
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]==target) {
				count+=1;
			}
		}
		
		System.out.println(count);
	}

}
