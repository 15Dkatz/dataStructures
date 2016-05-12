public class queueTester {
	// class to test queues

	public static void main(String[] args) {
		Queue testQueue = new Queue();
		testQueue.enqueue(new Node(1, null));
		testQueue.enqueue(new Node(3, null));
		testQueue.enqueue(new Node(5, null));
		testQueue.enqueue(new Node(8, null));
		testQueue.print();

		System.out.print("\n" + testQueue.dequeue().data + " dequeued.\n");
		System.out.print("\n" + testQueue.dequeue().data + " dequeued.\n");
		testQueue.print();
	}

}