package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	
	static void backtrack(int arr[],List<Integer>current,int index) {
		 
			 
			if(index==arr.length) {
				System.out.println(current);
				return;
			}
			
			
			//take
		    current.add(arr[index]);
		    backtrack(arr, current,index+1);
		    
		    //undo
		    current.remove( current.size()-1);
		    
		    //dont take
		    backtrack(arr, current,index+1);
		}
	  
	public static void main(String[] args) {
		 int arr[]= {1,2};
		 List<Integer> current = new ArrayList<>();
		 backtrack(arr, current, 0);
		 

	}

}
