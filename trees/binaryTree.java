public class binaryTree {

	// private Node root;
	// private Node current;

	// public binaryTree() {
	// 	this.root = null;
	// }

	// // method to actually call, to prestart the setting of current to root
	// public void insert(Node nextNode) {
	// 	this.current = this.root;
	// 	postInsert(nextNode);
	// }

	// public void postInsert(Node nextNode) {
	// 	if (this.root==null) {
	// 		this.root = nextNode;
	// 		this.current = this.root;
	// 	} else {
	// 		if (nextNode.getData()<this.root.getData()) {
	// 			if (this.root.getLeft()!=null) {
	// 				this.current = this.current.getLeft();
	// 				postInsert(nextNode);
	// 			} else {
	// 				this.current.setLeft(nextNode);
	// 			}

	// 		} else {
	// 			if (this.root.getRight()!=null) {
	// 				this.current = this.current.getRight();
	// 				postInsert(nextNode);
	// 			} else {
	// 				this.current.setRight(nextNode);
	// 			}
	// 		}
	// 	}
	// }

	// public void preOrder(Node root) {
	// 	// prints the nodes on a single line separated by spaces
	// 	System.out.print(root.getData() + " ");
	// 	if (root.getLeft()!=null) {
	// 		preOrder(root.getLeft());
	// 	}
	// 	if (root.getRight()!=null) {
	// 		preOrder(root.getRight());
	// 	}
	// }

	// hackerRank code
	// void preOrder(Node root) {
	//     System.out.print(root.data + " ");
	//     if (root.left!=null) {
	//         preOrder(root.left);
	//     }
	//     if (root.right!=null) {
	//         preOrder(root.right);
	//     }
	// }

	// referr to https://www.hackerrank.com/challenges/tree-postorder-traversal?h_r=next-challenge&h_v=zen to see tree
	// Sample Input

	// BTinput.png

	// Sample Output

	// 1 4 5 6 2 3

	// without private variables
	Node root;
	Node current;

	public void binaryTree() {
		this.root = null;
		this.current = null;
	}

	public void add(Node newNode) {
		this.current = this.root;
		postAdd(newNode);
	}

	public void postAdd(Node newNode) {
		if (this.root==null) {
			this.root = newNode;
			this.current = this.root;
		} else {
			if (this.current.data<newNode.data) {
				if (this.current.left!=null) {
					this.current = this.current.left;
					// recursive add
					postAdd(newNode);
				} else {
					this.current.left = newNode;
				}
			} else {
				if (this.current.right!=null) {
					this.current = this.current.right;
					//recursive add
					postAdd(newNode);
				} else {
					this.current.right = newNode;
				}
			}
		}
	}


	public void preOrder(Node root) {
		System.out.print(root.data + " ");
		if (root.left!=null) {
			preOrder(root.left);
		} 
		if (root.right!=null) {
			preOrder(root.right);
		}
	}

	public void postOrder(Node root) {
		if (root.left!=null) {
			postOrder(root.left);

		}
		if (root.right!=null) {
			postOrder(root.right);
		}
		System.out.print(root.data + " ");
	}

	
	// If the root node == parent, go to left child. 
	// If no left child, go to right child.
	// find left most element in subtree
	// print parent node
	public void inOrder(Node root) {
		if (root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}
}