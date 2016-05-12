class Node 
// implements Comparable<Node> 
{
    int data;
    Node next;
    // Node right;

    public Node(int inputData, Node inputNext) {
        this.data = inputData;
        this.next = inputNext;
    }

    // public Node getLeft() {
    //  return this.left;
    // }

    // public Node getRight() {
    //  return this.right;
    // }

    public int getData() {
        return this.data;
    }

    // public void setLeft(Node newLeft) {
    //  this.left = newLeft;
    // }

    // public void setRight(Node newRight) {
    //  this.right = newRight;
    // }

    // public void setData(int newData) {
    //  this.data = newData;
    // }

    // public int compareTo(Node otherNode) {
    //  if (otherNode!=null) {
    //      // check if this node is greater than other node
    //      return this.data - otherNode.getData();
    //  } else {
    //      return 0;
    //  }
    // }

}
