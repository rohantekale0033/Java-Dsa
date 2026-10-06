package stackNqueue;

import java.util.Stack;

//monotonic decreasing pattern to find next greater element
public class NextGreater {

	public static void main(String[] args) {
		 int arr[]= {4,5,2,10};
		 Stack<Integer> stack = new Stack<>();
		 int result[]=new int [arr.length];
		 
		 for(int i=arr.length-1; i>=0; i--) {
			 if(!stack.isEmpty() && stack.peek()<=arr[i]) {
				 stack.pop();
			 } 
			 
			 if(stack.isEmpty()) {
				 result[i]=-1;
		 	 }else {
		 		 result[i]=stack.peek();
		 	 }
			 
			 stack.push(arr[i]);
		 
			 
		 }
		 for(int i:result) {
			 System.out.print(i +" ");
		 }
		 

	}

}
