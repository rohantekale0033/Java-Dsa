package Array;

public class SubarrrayWithGivenSum {

	public static void main(String[] args) {
		 
		int arr[]={1, 2, 3, 7, 5};
		int target = 12;
		
        int start=0;
        
        while(start<arr.length) {
        	int sum=0;
        	int i = start;
        	
        	while(i<arr.length) {
        		sum+=arr[i];
        		if(sum==target) {
        			System.out.println("found");
        			return;
        		}
        		
        		if(sum>target) {
        			break;
        		}
        		i++;
        	}
        	start++;
        }
		
		 

	}

}
