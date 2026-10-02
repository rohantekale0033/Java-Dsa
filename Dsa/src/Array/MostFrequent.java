package Array;

import java.util.Arrays;

public class MostFrequent {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,3,4};
		int maxCount=0;
		int mostFrequent=0;
		
		for(int i :arr) {
			int count = 0;
			for(int j: arr) {
				if(i==j) {
					count++;
				}
				
				if(count>maxCount) {
					maxCount=count;
					mostFrequent=i;
				}
			 	
			}
			
			
		}
		System.out.println(mostFrequent);
	}

}
