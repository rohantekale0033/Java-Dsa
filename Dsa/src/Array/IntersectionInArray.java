package Array;

import java.util.Arrays;

public class IntersectionInArray {

	public static void main(String[] args) {
		 int arr1[] = {1, 2, 3, 4, 5};
		 int arr2[] = {3, 4, 5, 6, 7};
		 
		 int arr3[]= new int[arr1.length];
		 int pos = 0;
		 
		 for(int i : arr1) {
			 for(int j : arr2) {
				 if(i==j) {
					arr3[pos]  = i;
					pos++;
				 }
			 }
		 }
		 System.out.println(Arrays.toString( arr3));

	}

}
