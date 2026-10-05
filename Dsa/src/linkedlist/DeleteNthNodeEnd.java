package linkedlist;
 
public class DeleteNthNodeEnd {
	static void printList(Node head) {
	    Node current = head;

	    while (current != null) {
	        System.out.print(current.data + " ");
	        current = current.next;
	    }
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}


	public static void main(String[] args) {
		Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        int n = 3;
        
        Node slow = head;
        Node fast=head;
        
    	for(int i = 0; i<n;i++) {
    		fast=fast.next;
    	}
    	
        while( fast.next!=null) {
         
        	slow=slow.next;
        	fast=fast.next;
        	
        	
        }
        slow.next=slow.next.next;
        
        printList(head);
	}

}
