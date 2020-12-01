package www.stack.com;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
/*
class stack1 {
	private int[] arr;
	private int top;

	public stack1(int size) {
		arr = new int[size];
		top = -1;
	}

	void push(int val) {
		top++;
		arr[top] = val;
	}

	public void pop() {
		top--;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}  

	public boolean isFull() {
		return top == arr.length - 1;
	}
}

public class StackMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stack1 s = new stack1(3);
		int choice, val;
		do {
			System.out.println("\n1.Push\n2.pop\n3.peek\nEnter Your Choice :");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:// push
				if (s.isFull())
					System.out.print("stack is full");
				else {
					System.out.print("enter element to push");
					val = sc.nextInt();
					s.push(val);
				}
				break;
			case 2:// pop
				if (s.isEmpty()) {
					System.out.println("stack is empty");
				} else {
					System.out.println("enter element to pop");
					val = s.peek();
					s.pop();
					System.out.println("popped element : " + val);
				}

				break;
			case 3:// peek
				if (s.isEmpty()) {
					System.out.println("stack is empty");
				} else {
					val = s.peek();
					System.out.println("topmost element : " + val);
				}

				break;

			}
		} while (choice != 0);
		sc.close();

	}

}
*/

class stack1 {
	int[] arr;
	int top;

	public stack1(int size) {
		arr = new int[size];
		top = -1;
	}

	public void push(int val) {
		top++;
		arr[top] = val;
	}

	public void pop() {
		top--;
	}

	public boolean isEmpty() {
		return (top < 0);
	}

	public boolean isFull() {
		return (top == arr.length - 1);
	}

	int peek() {
		return arr[top];
	}

}

public class StackMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		stack1 s = new stack1(5);
		int choice, val;
		do {
			System.out.println("\n1.Push\n2.Pop\n3.Peek\nEnter your choice :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:// Push
				if (s.isFull()) {
					System.out.println("stack is full");

				} else {
					System.out.println("enter val to insert :");
					val = sc.nextInt();
					s.push(val);
				}
				break;
			case 2:// Pop
				if (s.isEmpty()) {
					System.out.println("stack is empty");
				} else {
					System.out.println("Enter value to pop :");
					val = s.peek();
					s.pop();
					System.out.println("Element deleped : " + val);
				}
				break;
			case 3:// Peek
				if (s.isEmpty()) {
					System.out.println("stack is empty");
				} else {
					val = s.peek();
					System.out.println("Topmost Element : " + val);
				}

				break;

			}

		} while (choice!=0);
		sc.close();

	}

}
