package Array;

public class PairWithMaxDiff {

	public static void main(String[] args) {
		 
	 int[] arr = {2, 5, 1, 7, 3};
	 
	 int smallest = arr[0];
	 int maxDiff = 0;
	 
	 for(int i :arr) {
		  int diff = i-smallest;
		  
		  if(diff>maxDiff) {
			  maxDiff=diff;
		  }
		  
		  if(i<smallest) {
			  smallest =i;
		  }
	}
	 System.out.println(maxDiff);

}
 }

