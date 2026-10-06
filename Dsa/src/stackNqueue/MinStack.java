package stackNqueue;

import java.util.Stack;

public class MinStack {
	
	 Stack<Integer>stack=new Stack<>();
	 Stack<Integer>minStack=new Stack<>();
	 
	 public void Push(int value) {
	    
		 stack.push(value);
		 if(minStack.isEmpty()||value<=minStack.peek()) {
			 minStack.push(value);
		 }
	 }
	 
	 public void pop() {
		 int value=stack.pop();
		 if( value ==minStack.peek()) {
			 minStack.pop();
		 }
	 }
	 
	 int getMin() {
		    return minStack.peek();
		}
	 

	public static void main(String[] args) {

	    MinStack ms = new MinStack();

	    ms.Push(5);
	    ms.Push(3);
	    ms.Push(7);
	    ms.Push(2);

	    System.out.println(ms.getMin());

	    ms.pop();

	    System.out.println(ms.getMin());
	}

	}

 
