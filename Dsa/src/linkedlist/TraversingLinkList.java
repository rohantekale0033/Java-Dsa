package linkedlist;


public class TraversingLinkList {

 static class Node{
	int data; 
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
	 
	public static void main(String[] args) {
		 
		Node head= new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		int target = 30 ;
		int length =0;
		Node current = head;
		while(current!=null) {
			if(current.data==target) {
				System.out.println("element found");
			}
			System.out.println(current.data);
			length++;
			current= current.next;
		}
		System.out.println(length);
		
	}

}
