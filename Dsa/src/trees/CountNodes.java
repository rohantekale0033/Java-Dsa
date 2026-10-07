package trees;

public class CountNodes {
	
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
	
	static int countNode(Node root) {
		
		 int count=0;
		 
		 if(root==null) {
			 return 0;
		 }
		 
		 int leftCount = countNode(root.left);
		 int rightCount=countNode(root.right);
		  count = leftCount+rightCount+1;
		  return count;
	}

	public static void main(String[] args) {
		 Node root = new Node(10);
		 root.left = new Node(5);
		 root.right = new Node(15);
		 
		 root.left.left= new Node(2);
		 root.left.right=new Node(7);
		 
		 root.right.right=new Node(20);
		 System.out.println(countNode(root));
		 

	}

}
