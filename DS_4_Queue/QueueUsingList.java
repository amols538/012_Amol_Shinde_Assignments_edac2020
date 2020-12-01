package www.stack.com;
//Using Linked list

class Queue {
	static class Node {
		int data;
		Node next;

		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}

	Node front, rear;

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	void enqueue(int key) // push
	{
		Node newNode = new Node(key);

		if (this.rear == null) {
			this.front = this.rear = newNode;
			return;
		}

		this.rear.next = newNode;
		this.rear = newNode;
	}

	void dequeue() {
		if (this.front == null)
			return;

		Node newNode = this.front;
		this.front = this.front.next;

		if (this.front == null)
			this.rear = null;
	}
}

//Driver class 

public class QueueUsingList {

	public static void main(String[] args) {
		Queue q = new Queue();
//		q.enqueue(10);
//		q.enqueue(20);
//		q.dequeue();
//		q.dequeue();
		q.enqueue(30); 
		q.enqueue(40);
		q.enqueue(50);
		q.dequeue();
		System.out.println("Queue Front : " + q.front.data);
		System.out.println("Queue Rear : " + q.rear.data);
	}
}
