public class Stack {
	Node top;

	Node pop() {
		// note that this method will not return the data of the node, but the memory location of the node
		// to access the data later on, set a Node variable to the pop, and access the data with .data
		if (top!=null) {
			Node topNode = top;
			top = top.next;
			return topNode;
		}
		return null;
	}
	void push(Node newTop) {
		if (top!=null) {
			Node oldTop = top;
			top = newTop;
			top.next = oldTop;
		} else {
			top = newTop;
		}
	}

	void printStack() {
		printStackRecursively(top);
	}

	void printStackRecursively(Node topNode) {
		if (topNode!=null) {
			System.out.print(topNode.data + " ");
		}
		if (topNode.next!=null) {
			printStackRecursively(topNode.next);
		}
	}


}