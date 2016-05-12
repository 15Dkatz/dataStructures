public class Queue {
	// FIFO - First In, First Out method
	Node front;
	Node back;

	public Queue() {
		this.front = null;
		this.back = null;
	}

	public void enqueue(Node newBack) {
		if (this.front!=null) {
			this.back.next = newBack;
			this.back = newBack;
		} else {
			this.back = newBack;
			this.front = this.back;
		}

	}

	public Node dequeue() {
		if (this.front!=null) {
			Node frontReturned = this.front;
			this.front = this.front.next;
			return frontReturned;
		}
		return null;
	}

	public void print() {
		printRecursively(this.front);
	}

	public void printRecursively(Node printNode) {
		
		if (printNode!=null) {
			System.out.print(printNode.data + " ");
			printRecursively(printNode.next);
		}
	}
}