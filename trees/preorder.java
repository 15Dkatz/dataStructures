// In a Pre-Order traversal
// You keep traversing the left most part of the true until you encounter a leaf node
// Then you traverse up the tree to the right child, and then go as far left as possible
// until you hit all nodes

// outline of implementation:
// 1. Print out the root value whether or not you have the root of the whole tree, or you have a subtree
// 2. Go to the left child node and then perform a pre-order traversal on that left child node's substree
// 3. Go to the right child node and then perform a pre-order traversal on that right child node's substree
// 4. Use recursion to iterate through the entire tree.

public class preorder {


	// testing code
	public static void main(String[] args) {

		binaryTree testBinary = new binaryTree();
		Node rootNode = new Node(1, null, null);
		testBinary.insert(rootNode);
		testBinary.insert(new Node(4, new Node(5, null, null), null));
		// testBinary.insert(new Node(4, new Node(5, null, null), null));
		// testBinary.insert(new Node(8, new Node(7, null, null), null));

		testBinary.preOrder(rootNode);

	}

}