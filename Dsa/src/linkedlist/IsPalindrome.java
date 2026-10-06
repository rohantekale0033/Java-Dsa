package linkedlist;

 

public class IsPalindrome {
	
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
		Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
        
        Node slow=head;
        Node fast=head;
        
        while(fast != null && fast.next != null) {
        	slow=slow.next;
        	fast=fast.next.next;
        }
        
        Node current=slow;
        Node prev=null;
        
        while(current!=null) {
        	Node next=current.next;
        	current.next=prev;
        	prev=current;
        	current=next;
        }
         
        Node first=head;
        Node second=prev;
        while (second != null) {
            if (first.data != second.data) {
                System.out.println("Not Palindrome");
                return;
            }

            first = first.next;
            second = second.next;
        }

        System.out.println("Palindrome");
        		
        
        
	}

}
