// doubly LinkedList
public class LinkedList {
	Node root;
	Node current;
	Node previous;

	LinkedList() {
		this.root = null;
		this.current = null;
		this.previous = null;
	}

	public void add(Node newNode) {
		if (this.root == null) {
			this.root = newNode;
			this.current = this.root;
		} else {
			Node prevNode = this.current;
			this.current.next = newNode;
			this.current = newNode;
			this.previous = prevNode;
		}
	}

	boolean search(int target) {
		this.current = this.root;
		while(this.current.next!=null) {
			if (this.current.data == target) {
				return true;
			}
			this.current = this.current.next;
		}
		return false;
	}

	public void insert(Node newNode, int target) {
		this.current = this.root;
		while(this.current.next!=null) {
			if (this.current.data == target) {
				Node prevNode = this.current;
				newNode.next = prevNode.next;
				this.current.next = newNode;
				this.current = newNode;
				this.previous = prevNode;
			}
			this.current = this.current.next;
		}
	}

	public void remove(int target) {
		this.current = this.root;
		while(this.current.next!=null) {
			if (this.current.data == target) {
				Node prevNode = this.previous;
				prevNode.next = this.current.next;
				this.current = this.current.next;
			}
			this.current = this.current.next;
		}
	}

	public void print() {
		this.current = this.root;
		printList(this.current);
	}

	// recursive print to iterate through current
	public void printList(Node newNode) {
		if (newNode!=null) {
			System.out.println(newNode.toString());
			printList(newNode.next);
		}
	}
}