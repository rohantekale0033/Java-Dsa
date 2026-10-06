package stackNqueue;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		 
		Stack<Character> stack = new Stack<>();
		
		String input = "()[{}"; 
		
		for(int i =0; i<input.length();i++) {
			char ch =input.charAt(i);
			
			if(ch =='('|| ch=='[' || ch=='{' ) {
				stack.push(ch);
			} else {
				 if(stack.isEmpty()) {
					 System.out.println("invalid");
				 }
				 char top = stack.peek();
				 if(top=='(' && ch ==')' ||top=='['&&ch==']'||top=='{'|| ch=='}') {
					 stack.pop();
				 }else {
					 System.out.println("invalid");
				 }
			}
		}
		if(stack.isEmpty()) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	}

}
