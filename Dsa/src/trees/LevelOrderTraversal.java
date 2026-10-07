package trees;
 
import java.util.LinkedList;
import java.util.Queue;

import trees.CountNodes.Node;

public class LevelOrderTraversal {
	
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
	
	static void levelOrder(Node root) {
		
		if(root==null) {
			return;
		}
		
		Queue<Node> q = new  LinkedList<>();
		q.add( root);
		
		while(!q.isEmpty()) {
			Node value = q.remove();
			System.out.print(value.data + " ");
			
			if(value.left!=null) {
		     q.add(value.left);
		    }
			if(value.right!=null) {
				q.add(value.right);
			}
		}
	 
	}
 
	public static void main(String[] args) {
		 Node root = new Node(10);
		 root.left = new Node(5);
		 root.right = new Node(15);
		 
		 root.left.left= new Node(2);
		 root.left.right=new Node(7);
		 
		 root.right.right=new Node(20);
		  levelOrder(root);
		 

	}

}
