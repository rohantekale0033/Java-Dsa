package linkedlist;

 

public class InsertNode {
	
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
        
        Node current=head.next;
        int value=25;
        
        Node newNode = new Node(value);
        
        
        Node next=current.next;
        current.next=newNode;
        newNode.next=next;
        
        printList(head);
        
	}

}
