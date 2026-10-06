package queue;

public class Implementation {
	
	 int queue[]=new int[5];
	 int front=0;
	 int rear=0;
	 
	 
	 void enqueue(int value) {
		 queue[rear]=value;
		 rear++;
	 }
	 
	 int dequeue() {
		 int value=queue[front];
		 front++;
		 return value;
	 }
	 
	 boolean isEmpty() {
		 return front==rear;
	 }
	 
	 int peek() {
		 return queue[front];
	 }

	public static void main(String[] args) {
		 
		Implementation i = new Implementation();
		i.enqueue(10);
		i.enqueue(20);
		i.enqueue(30);
		 
		System.out.println(i.peek());

	}

}
