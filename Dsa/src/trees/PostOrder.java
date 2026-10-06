package trees;

import trees.InorderTraversal.Node;

public class PostOrder {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			left=null;
			right=null;
			
		}
	}
	
	static void postOrder(Node root) {
		if(root==null) {
			return;
		}
		 postOrder(root.left);
		 postOrder(root.right);
		 System.out.print(root.data + "  ");
		 
		
	}
	public static void main(String[] args) {
		Node root = new Node(10);

		root.left = new Node(5);
		root.right = new Node(15);

		root.left.left = new Node(2);
		root.left.right = new Node(7);

		root.right.right = new Node(20);
		
		postOrder(root);
	}

}
