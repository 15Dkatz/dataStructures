class Node implements Comparable<Node> {
    int data;
    Node left;
    Node right;

    public Node(int inputData, Node inputLeft, Node inputRight) {
    	this.data = inputData;
    	this.left = inputLeft;
    	this.right = inputRight;
    }

    public Node getLeft() {
    	return this.left;
    }

    public Node getRight() {
    	return this.right;
    }

    public int getData() {
    	return this.data;
    }

    public void setLeft(Node newLeft) {
    	this.left = newLeft;
    }

    public void setRight(Node newRight) {
    	this.right = newRight;
    }

    public void setData(int newData) {
    	this.data = newData;
    }

    public int compareTo(Node otherNode) {
    	if (otherNode!=null) {
    		// check if this node is greater than other node
    		return this.data - otherNode.getData();
    	} else {
    		return 0;
    	}
    }

}
