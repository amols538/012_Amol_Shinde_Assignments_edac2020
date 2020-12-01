package LinkedList;

import java.util.Scanner;

class Singly {
	static class Node {
		private int data;
		private Node next; // just a pointer or reference pointing next node object

		public Node() {
			data = 0;
			next = null;
		}

		public Node(int val) {
			data = val;
			next = null;
		}
	}

	private Node head;

	public Singly() {
		head = null;
	}

	public void addFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;

	}

	public void addLast(int val) {
		Node newNode = new Node(val);

		if (head == null) { // Case 1: Head ==Null (Special Case)
			head = newNode; // newNode will be first Node

		} else { // Case 2: if link list is not empty
			// So need to traverse till last node
			Node trav = head;
			while (trav.next != null) {
				// add address of newNode to trav.next of last node
				trav = trav.next;

			}
			trav.next = newNode;
		}

	}

	public void display() {
		System.out.print("List :");
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + ", ");
			trav = trav.next;
		}
		System.out.println();

	}

	public void addAtPos(int val, int pos) {
		// 4.if position is less than 0
		if (pos < 1) {
			throw new RuntimeException("Invalid position" + pos);

		}
		// 1. if list is empty Or 2.add at pos=1
		if (head == null || pos == 1) {
			addFirst(val);

		} else {
			// create a new node
			Node newNode = new Node(val);
			// traverse till pos-1
			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				// 3. if pos is beyond length of list, throw error
				if (trav == null) {
					throw new RuntimeException("Invalid Position " + pos);
				}
				trav = trav.next;

			}
			// add node at that pos
			newNode.next = trav.next;
			trav.next = newNode;

		}

	}

	void delFirst() {
		if (head == null) {
			throw new RuntimeException("List is Empty");

		}
		head = head.next;
	}

	void delAtPos(int pos) {
		if (pos < 1) {
			throw new RuntimeException("Invalid position " + pos);
		}
		if (head == null || pos == 1) {
			delFirst();

		} else {

			Node trav = head;
			for (int i = 1; i < pos - 1; i++) {
				if (trav == null) {
					throw new RuntimeException("Invalid position " + pos);
				}
				trav = trav.next;

			}
			Node temp = trav.next;
			if (temp == null) {
				throw new RuntimeException("Invalid position " + pos);
			}
			trav.next = temp.next;
		}
	}

	void deleteAll() {
		while (head != null) {
			delFirst();
			// or
			// head=head.next;
		}
	}

	void delLast() {
		if (head == null || head.next == null) {
			delFirst();
		}
		Node temp = null;
		Node trav = head;
		while (trav.next != null) {
			temp = trav;
			trav = trav.next;
		}
		temp.next = null;
	}

}

public class SinglyList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		int val;
		int pos;
		Singly obj=new Singly();
		do {
			System.out.println("0.Exit\n1.Add First\n2.Add Last\n3.Add at pos\n4.Display\n5.Del First\n6.Del Last\n7.Del at Pos\n8.Del All\nEnter Your Choice : ");
			choice=sc.nextInt();
			switch (choice) {
			case 1://addFirst
				System.out.println("Enter Element :");
				val=sc.nextInt();
				obj.addFirst(val);
				break;
            case 2://addLast
            	System.out.println("Enter Element :");
				val=sc.nextInt();
				obj.addLast(val);
				break;
			case 3://add at pos
				System.out.println("Enter Element :");
				val=sc.nextInt();
				System.out.println("Enter Positon :");
				pos=sc.nextInt();
				obj.addAtPos(val, pos);
				break;
			case 4://Display
				obj.display();
				break;
			case 5://Del first
				obj.delFirst();
				break;
			case 6://Del last
				obj.delLast();
				break;
			case 7://Del at pos
				System.out.println("Enter Positon :");
				pos=sc.nextInt();
				obj.delAtPos(pos);
				break;
			case 8://Delete All
				obj.deleteAll();
				break;
			case 0://assFirst
				
				break;
			
				

			default:
				break;
			}
			
		}while (choice!=0);
		sc.close();
	}

	/*
	 * public static void main(String[] args) { Singly l1 = new Singly();
	 * l1.addLast(11); l1.addLast(22); l1.addLast(33); l1.addLast(44);
	 * l1.addAtPos(55, 5); // l1.addLast(50); // l1.addLast(60); // l1.addFirst(44);
	 * l1.display(); l1.delFirst(); l1.display(); //l1.delAtPos(3); //l1.display();
	 * //l1.deleteAll(); //l1.display(); l1.delLast(); l1.display();
	 * 
	 * }
	 */

}
