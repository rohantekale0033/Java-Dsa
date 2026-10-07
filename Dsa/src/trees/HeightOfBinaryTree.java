package trees;
 
public class HeightOfBinaryTree {
	static class Node {
	int data;
	Node left;
	Node right;
	
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}
}
	static int height(Node root) {
		if(root==null) {
			return 0;
		}
		
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		
		return Math.max(leftHeight, rightHeight)+1;
	}
	

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);

		root.left.left = new Node(2);
		root.left.right = new Node(7);

		root.right.right = new Node(20);
		System.out.print(height(root) +"  "); 

	}

}
