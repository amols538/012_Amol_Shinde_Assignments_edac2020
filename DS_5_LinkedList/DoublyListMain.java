package LinkedList;

class DoublyList {
	static class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node() {
			data = 0;
			next = null;
			prev = null;
		}

		public Node(int val) {
			data = val;
			next = null;
			prev = null;
		}

	}

	private Node head;
	private int count;

	public DoublyList() {

		head = null;
		count = 0;

	}

	public int getCount() {
		return count;
	}

	public void display() {
		Node temp = null;
		// display Forward
		System.out.print("Fwd List: ");
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " ,");
			temp = trav;
			trav = trav.next;
		}
		System.out.println();
		// display reverse
		System.out.print("Rev List: ");
		trav = temp;
		while (trav != null) {
			System.out.print(trav.data + " ,");
			trav = trav.prev;
		}
		System.out.println();

	}

	void addLast(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null) {
				trav = trav.next;
			}
			trav.next = newNode;
			newNode.prev = trav;
		}
		this.count++;

	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;

		}
		this.count++;
	}

	void addAtPos(int val, int pos) {
		// sp3:add at last pos
		if (pos == count + 1) {
			addLast(val);
		}
		// sp4:add at invalid pos
		else if (pos < 1 || pos > count + 1) {
			throw new RuntimeException("Invalid Position : " + pos);
		}

		// sp1:list is empty or sp2 : pos is 1
		else if (head == null || pos == 1) {
			addFirst(val);
		} else {
			Node newNode = new Node(val);
			// traverse till pos-1
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				trav = trav.next;
			}
			// mark its next node as temp
			Node temp = trav.next;
			// add newNode between trav and temp
			newNode.next = temp;
			newNode.prev = trav;
			trav.next = newNode;
			temp.prev = newNode;
			this.count++;

		}

	}

	public void delFirst() {
		if (head == null) {
			throw new RuntimeException("list is Empty ");
		}
		if (head.next == null) {
			head = null;
		} else {
			head = head.next;
			head.prev = null;
		}
		this.count--;
	}

	private void delAtPos(int pos) {
		// sp1: list i empty or sp2: pos=1
		if (head == null || pos == 1) {
			delFirst();
		} else {
			// sp3:Invalid position
			if (pos < 1 || pos > count) {
				throw new RuntimeException("Invalid Position " + pos);
			}

			// trav till pos
			Node trav = head;
			for (int i = 1; i < pos; i++) {
				trav = trav.next;
			}
			// delete trav node
			trav.prev.next = trav.next;
			// sp4if not last node to delete
			if (trav.next != null) {
				trav.next.prev = trav.prev;
				this.count--;

			}

		}
	}
}

public class DoublyListMain {

	public static void main(String[] args) {
		DoublyList o1 = new DoublyList();
		o1.addLast(11);
		o1.addLast(22);
		o1.addLast(33);
		o1.addFirst(44);
		System.out.println("Count :" + o1.getCount());
		o1.addAtPos(55, 5);
		System.out.println("Count :" + o1.getCount());
		o1.display();
		o1.delFirst();
		System.out.println("Count :" + o1.getCount());
		o1.delFirst();
		System.out.println("Count :" + o1.getCount());
		o1.delFirst();
		System.out.println("Count :" + o1.getCount());
		o1.delFirst();
		System.out.println("Count :" + o1.getCount());
		o1.delFirst();
		System.out.println("Count :" + o1.getCount());
		o1.delFirst();
		System.out.println("Count :" + o1.getCount());
		o1.display();

	}

}
