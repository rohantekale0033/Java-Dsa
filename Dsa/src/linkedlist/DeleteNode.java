package linkedlist;
 

public class DeleteNode {
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
        int target = 10;
        
        if(head.data==target) {
        	head=head.next;
        }else {
        	Node current = head;
        	while(current.next!= null) {
        		if(current.next.data==target) {
        			current.next=current.next.next;
        			break;
        		}
        		
        		current=current.next;
        	}
        }
        
         
        printList(head);
        
       
        
        
	}
	
	
}
	

