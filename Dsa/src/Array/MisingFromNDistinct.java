package Array;

public class MisingFromNDistinct {

	public static void main(String[] args) {
		 int arr[]= {3,0,1,5,2};
		 
		 int n = arr.length;
		 
		 //expected sum 
		int  expSum = n*(n+1)/2;
		
		
		int actSum=0;
		//actualSum
		for(int i : arr) {
			actSum+=i;
		}
		
		//Mising number 
		
	    int missNo= expSum - actSum;
	    
	    System.out.println(missNo);
	     
	}

}
