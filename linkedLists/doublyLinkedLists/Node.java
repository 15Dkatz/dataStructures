public class Node {
	// left
	// right 
	// data
	int data;
	Node next;
	// Node prev;

	Node(int inputData) {
		this.data = inputData;
		this.next = null;
		// this.prev = null;
	}

	public String toString() {
		return "Node: " + data;
	}

}