public class binaryTree {

	private Node root;
	private Node current;

	public binaryTree() {
		this.root = null;
	}

	// method to actually call, to prestart the setting of current to root
	public void insert(Node nextNode) {
		this.current = this.root;
		postInsert(nextNode);
	}

	public void postInsert(Node nextNode) {
		if (this.root==null) {
			this.root = nextNode;
			this.current = this.root;
		} else {
			if (nextNode.getData()<this.root.getData()) {
				if (this.root.getLeft()!=null) {
					this.current = this.current.getLeft();
					postInsert(nextNode);
				} else {
					this.current.setLeft(nextNode);
				}

			} else {
				if (this.root.getRight()!=null) {
					this.current = this.current.getRight();
					postInsert(nextNode);
				} else {
					this.current.setRight(nextNode);
				}
			}
		}
	}

	public void preOrder(Node root) {
		// prints the nodes on a single line separated by spaces
		System.out.print(root.getData() + " ");
		if (root.getLeft()!=null) {
			preOrder(root.getLeft());
		}
		if (root.getRight()!=null) {
			preOrder(root.getRight());
		}
	}

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

}