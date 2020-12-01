package BSTImplement;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import BSTImplement.BinSearchTree.Node;

class BstDFSMain {
	static class Node {
		private int data;
		private Node left;
		private Node right;

		public Node() {
			data = 0;
			left = null;
			right = null;
		}

		public Node(int val) {
			data = val;
			left = null;
			right = null;
		}

		@Override
		public String toString() {

			return "node [data=" + data + "]";
		}
	}

	private Node root;

	public void add(int val) {
		Node newNode = new Node(val);
		if (root == null)
			root = newNode;
		else {
			Node trav = root;
			while (true) { // infinite loop
				if (val < trav.data) {
					if (trav.left == null) {
						trav.left = newNode;
						break;
					} else {
						trav = trav.left;

					}
				} else {
					if (trav.right == null) {
						trav.right = newNode;
						break;
					} else {
						trav = trav.right;
					}
				}

			}
		}
	}

	public void depthFiefirstSearch() {
		System.out.print("DFS :");
		Stack<Node> s = new Stack<Node>();
		s.push(this.root);

		while (!s.isEmpty()) {
			Node trav = s.pop();
			System.out.print(trav.data + ", ");
			if (trav.right != null) {
				s.push(trav.right);
				if (trav.left != null) {
					s.push(trav.left);
				}
			}
		}
		System.out.println();
	}

	public void breadthFiefirstSearch() {
		System.out.print("BFS :");
		Queue<Node> s = new LinkedList<Node>(); 
		s.offer(this.root);

		while (!s.isEmpty()) {
			Node trav = s.poll();
			System.out.print(trav.data + ", ");
			if (trav.left != null) {
				s.offer(trav.left);
			}
			if (trav.right != null) {
				s.offer(trav.right);

			}
		}
	}
	public void recInOrder(Node trav) {
		if (trav == null) {
			return;
		}
		recInOrder(trav.left);// L
		System.out.print(trav.data + ", "); // V
		recInOrder(trav.right);// R

	}

	public void recInOrder() {
		System.out.print("In :");
		recInOrder(root);
		System.out.println();
	}

	public Node[] find(int val) {
		Node parent = null;
		Node trav = root;
		while (trav != null) {
			if (val == trav.data)
				return new Node[] { trav, parent };
			parent = trav;
			if (val < trav.data) {
				trav = trav.left;
			} else {
				trav = trav.right;
			}
		}
		return new Node[] { null, null };

	}

	public void delNode(int val) {
		// Find the node to be deleted with its parents
		Node[] found = this.find(val); // parent as wella as node we will get
		Node temp = found[0], parent = found[1]; // temp=[0] parent=[1]
		if (temp == null) {
			throw new RuntimeException("Node Not Found");
		}

		// if node has parent as well as child node
		if (temp.left != null && temp.right != null) {
			Node succ = temp.right;
			while (succ.left != null) {
				parent = succ;
				succ = succ.left;
			}
			temp.data = succ.data;
			temp = succ;
		}

		// if node doesnt have left child left==null
		if (temp.left == null) {
			if (temp == root) {
				root = temp.right;
			} else if (temp == parent.left) {
				parent.left = temp.right;
			} else {// if temp is parent.right
				parent.right = temp.right;
			}
			temp = null;
		}
		// if node doesnt have right child Right==null
		else if(temp.right==null) {
			if (temp == root) {
				root = temp.left;
			} else if (temp == parent.left) {
				parent.left = temp.left;
			} else {// if temp is parent.right
				parent.right = temp.left;
			}
			temp = null;
			
		}
	}
}

public class BstDSF {
	public static void main(String[] args) {
		BstDFSMain bst = new BstDFSMain();
		bst.add(50);
		bst.add(30);
		bst.add(10);
		bst.add(90);
		bst.add(100);
		bst.add(40);
		bst.add(70);
		bst.add(20);
		bst.add(60);
		bst.add(80);
		//bst.depthFiefirstSearch();
		bst.recInOrder();
		bst.delNode(60);
		bst.recInOrder();
		//bst.breadthFiefirstSearch();

	}

}
