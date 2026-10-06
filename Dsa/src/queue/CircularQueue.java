package queue;

public class CircularQueue {
	int queue[]=new int[5];
	int front=0;
	int rear=0;
	int count =0;
	
	void enqueue(int value) {
		if(count==queue.length) {
			System.out.println("queue is already full");
			return;
		}
		
		queue[rear]=value;
		rear=(rear+1)%queue.length;
		count++;
	}
	
	int dequeue() {
		if(count==0) {
			System.out.println("queue is empty");
			return -1 ;
		}
		
		int value= queue[front];
		front=(front+1) % queue.length;
		count--;
		return value;
	}
	
	int peek() {
		if (count == 0) {
	        System.out.println("Queue is empty");
	        return -1;
	    }

	    return queue[front];
	}
	
	
	
	

	public static void main(String[] args) {
		 
		CircularQueue q = new CircularQueue();
		 
		q.dequeue();

	}

}
