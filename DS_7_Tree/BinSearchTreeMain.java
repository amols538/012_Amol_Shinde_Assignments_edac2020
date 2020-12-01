package BSTImplement;

class BinSearchTree {
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
			
			return "node [data=" + data +"]";
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

	private void recAdd(Node trav, int val) {
		if (val < trav.data) {
			if (trav.left == null) {
				trav.left = new Node(val);
			} else {
				recAdd(trav.left, val);
			}
		} else {
			if (trav.right == null) {
				trav.right = new Node(val);
			} else {
				recAdd(trav.right, val);

			}

		}

	}

	public void recAdd(int val) {
		if (root == null) {
			root = new Node(val);
		} else {
			recAdd(root, val);
		}

	}

	private void recPreOrder(Node trav) {
		if (trav == null) {
			return;
		}
		System.out.print(trav.data + ", "); // V
		recPreOrder(trav.left);// L
		recPreOrder(trav.right);// R

	}

	public void recPreOrder() {
		System.out.print("Pre :");
		recPreOrder(root);
		System.out.println();
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
  
	public void recPostOrder(Node trav) {
		if (trav == null) {
			return;
		}
		recPostOrder(trav.left);// L
		recPostOrder(trav.right);// R
		System.out.print(trav.data + ", "); // V

	}

	public void recPostOrder() {
		System.out.print("Post :");
		recPostOrder(root);
		System.out.println();
	}

	private void delTree(Node trav) {
		if (trav == null) {
			return;
		}
		delTree(trav.left);
		trav.left = null;
		delTree(trav.right);
		trav.right = null;
		trav = null;

	}

	public void delTree() {
		delTree(root);
		root = null;

	}
	private int recHeight(Node trav) {
		if(trav==null)
			return -1; //height of null tree -1
		int hl=recHeight(trav.left);
		int hr=recHeight(trav.right);
		int max=Integer.max(hl, hr);
		return max+1;
	}
	public int recHeight() {
		return recHeight(root);
	}
	private Node recFind(Node trav,int val) {
		if (trav==null) {
			return null;
		}
		if(val==trav.data) {
			return trav;
		}
		if(val < trav.data ) {
			return recFind(trav.left, val);
		}
		else {
			return recFind(trav.right, val);
		}
		
	}
	public Node recFind(int val) {
		return recFind(root,val);
	}
	
	public Node find(int val) {
		Node trav=root;
		while (trav!=null) {
			if(val==trav.data)
				return trav;;
			if(val<trav.data) {
				trav=trav.left;
			}
			else {
				trav=trav.right;
			}
		}
		return null;
		
	}
	

}

public class BinSearchTreeMain {

	public static void main(String[] args) {
		BinSearchTree bst = new BinSearchTree();
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
		bst.delTree();
		
		bst.recAdd(50);
		bst.recAdd(30);
		bst.recAdd(10);
		bst.recAdd(90);
		bst.recAdd(100);
		bst.recAdd(40);
		bst.recAdd(70);
		bst.recAdd(20);
		bst.recAdd(60);
		bst.recAdd(80);
		bst.find(20);-
		//bst.delTree();
		bst.recPreOrder();
		bst.recInOrder();
		bst.recPostOrder();
		System.out.println("Height : "+bst.recHeight() );
		//BinSearchTree.Node temp=bst.recFind(80);
		BinSearchTree.Node temp=bst.find(80);
		if (temp==null) {
			System.out.println("Node not Found ");
		} else { 
			System.out.println("Node Found "+ temp);

		}
		bst.delTree();
		System.out.println("Height : "+bst.recHeight() );
		
	}

}
