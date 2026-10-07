package trees;

import trees.CountNodes.Node;

public class SearchInBinaryTree {
	

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
	
	static boolean search(Node root,int target) {
		  
		if(root==null) {
			return false ;
		}
		
		if(root.data==target) {
		 return true;
		}
		return (search(root.left,target)||
		search(root.right,target));
		
		 
		
	}
	

	public static void main(String[] args) {
		 Node root = new Node(10);
		 root.left = new Node(5);
		 root.right = new Node(15);
		 
		 root.left.left= new Node(2);
		 root.left.right=new Node(7);
		 
		 root.right.right=new Node(20);
		 
		 System.out.println(search(root, 7));
		 System.out.println(search(root, 12));

	}

}
