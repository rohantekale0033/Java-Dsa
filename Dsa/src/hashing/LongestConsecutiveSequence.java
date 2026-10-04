package hashing;

 
import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		 
		int arr[]={100, 4, 200, 1, 3, 2};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int i :arr) {
			set.add(i);
		}
		 int maxLength=0;
		 for(int i =0; i<arr.length; i++) {
			 
			 int current = arr[i];
			 if(!set.contains(current-1)) {
				 
				 int next= current +1;
				 int length = 1;
				 while(set.contains(next)) {
					 length++;
					 next++;
				 }
				 if(length>maxLength) {
					 maxLength=length;
				 }
				 
			 }
		 }
		 System.out.println(maxLength);

	}

}
