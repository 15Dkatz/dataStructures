public class Driver {
	public static void main(String[] args) {
		// testing doublyLinkedList
		LinkedList doubly = new LinkedList();
		doubly.add(new Node(3));
		doubly.add(new Node(2));
		doubly.add(new Node(5));
		doubly.add(new Node(8));

		doubly.insert(new Node(6), 5);
		doubly.insert(new Node(7), 2);

		doubly.print();

		System.out.println("testing removal");
		doubly.remove(7);

		doubly.print();

	}
}