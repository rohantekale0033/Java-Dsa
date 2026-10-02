package Array;

import java.util.Arrays;

public class SortsOf0s1s2s {

	public static void main(String[] args) {
		 int arr[]= {2,0,2,1,1,0};
		 int Count0=0;
		 int Count1=0;
		 int Count2=0;
		 
		 
		 for(int i : arr) {
			 if(i==0) {
				 Count0++;
			 }else if(i==1) {
				 Count1++;
			 }else {
				 Count2++;
			 }
		 }
		 
		  for(int i = 0 ; i<arr.length; i++ ) {
			  if(i<Count0) {
				  arr[i]=0;
			  }else if(i<Count0+Count1) {
				  arr[i]=1;
			  }else {
				  arr[i]=2;
			  }
		  }
		  
		  System.out.println(Arrays.toString( arr));
		 

	}

}
