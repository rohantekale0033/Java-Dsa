package linkedlist;

 
public class ReverseLinkedLIst {
 
	public static void main(String[] args) {

        PrintList list = new PrintList();

        list.head = new PrintList.Node(10);
        list.head.next = new PrintList.Node(20);
        list.head.next.next = new PrintList.Node(30);

        PrintList.Node prev = null;
        PrintList.Node current = list.head;
	        
		 while(current!=null) {
			 
			 PrintList.Node next = current.next;
			 current.next=prev;
			 
			 prev=current;
			 current= next;
			 
		 }
	 list.head= prev;
	 list.printList();
		 

	}

}
