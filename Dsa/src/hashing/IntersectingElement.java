package hashing;

import java.util.HashSet;

public class IntersectingElement {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {3, 4, 5, 6, 7};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i : arr1) {
			set.add(i);
		}
		
		for(int i : arr2) {
			if(set.contains(i)) {
				System.out.print(i+" , ");
			}
		}

	}

}
