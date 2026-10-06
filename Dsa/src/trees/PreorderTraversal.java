package trees;

public class PreorderTraversal {
	
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
		
		static void preorder(Node root) {
			if(root==null) {
				return;
			}
			System.out.println(root.data);
			preorder(root.left);
			preorder(root.right);
		 
		}
	

	public static void main(String[] args) {
		 Node root =new Node(10);
		 root.left=new Node(5);
		 root.right=new Node(15);
		 root.left.left=new Node(2);
		 root.left.right=new Node(7);
		  
		 preorder(root);
		 
	}
 
}
