package linkedlist;

public class MergedTwoSortedLinkList {
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
		
		Node head1=new Node(1);
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		
		Node head2 = new Node(2);
		head2.next = new Node(4);
		head2.next.next = new Node(6);
		
		Node current1=head1;
		Node current2=head2;
		
		Node dummy = new Node(0);
		Node merged = dummy;
		
		while(current1!=null && current2!=null) {
			
			if(current1.data <current2.data) {
				merged.next=current1;
				current1=current1.next;
			}else {
				merged.next=current2;
				current2=current2.next;
			}
			 
			merged=merged.next;
		}
		
		// remaining elements
		if(current1!=null) {
			merged.next=current1;
		}else {
			merged.next=current2;
		}
		
		 Node result = dummy.next;

	        printList(result);
		 

	}

}
