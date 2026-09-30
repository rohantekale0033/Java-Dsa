package Array;

public class SecondSmallest {

	public static void main(String[] args) {
		 int arr[]= {7, 3, 9, 2, 5};
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0 ; i<arr.length ; i++ ) {
			
			if(arr[i]<smallest) {
				secondSmallest = smallest;
				smallest=arr[i];
			 }else if(arr[i]<secondSmallest && arr[i] != smallest) {
				 secondSmallest= arr[i];
			 }
			
		}
		
		System.out.println(smallest);
		System.out.println(secondSmallest);

	}

}
