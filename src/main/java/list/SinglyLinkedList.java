package list;

public class SinglyLinkedList {

  private Node head;
  private int length;

  public void add(int data) {
    Node newNode = new Node(data);
    newNode.setNextNode(this.head);
    this.head = newNode;
    setLength(getLength() + 1);
  }

  public void remove(int data) {
    if (this.head.getData() == data) {
      this.head = this.head.getNextNode();
      length--;

    }

    Node currentNode = this.head;

    while (currentNode != null) {
      if (currentNode.getNextNode() != null && currentNode.getNextNode().getData() == data) {
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        length--;
        return;

      }
      currentNode = currentNode.getNextNode();
    }

  }

  public void find() {

  }

  public void printLinkedList() {
    Node currentNode = this.head;
    while (currentNode != null) {
      System.out.print(currentNode);
      currentNode = currentNode.getNextNode();
    }
  }

  public int getLength() {
    return length;
  }

  public void setLength(int length) {
    this.length = length;
  }

  int getNthNode(int index) {
    return getNthNode(this.head, index);
  }

  int getNthNode(Node node, int index) {
    if (index == 0)
      return node.getData();
    return getNthNode(node.getNextNode(), index - 1);
  }

  void reverseLinkedList() {
    Node current = this.head;
    Node prev = null;
    Node next = null;

    while (current != null) {
      next = current.getNextNode();
      current.setNextNode(prev);
      prev = current;
      current = next;
    }
    this.head = prev;
  }

  boolean detectLoop() {
    Node slow = this.head;
    Node fast = this.head;

    while (slow != null && fast != null && fast.getNextNode() != null) {
      slow = slow.getNextNode();
      fast = fast.getNextNode().getNextNode();

      if (slow.equals(fast))
        return true;
    }
    return false;
  }

  void addAtEnd(int data) {
    Node nnode = new Node(data);
    Node head = this.head;

    if (head == null) {
      this.head = nnode;
      return;
    }

    Node current = head;

    while (current.getNextNode() != null) {
      current = current.getNextNode();
    }
    current.setNextNode(nnode);
  }

  public void getNthFromEnd(int num) {
    int len = 0;

    Node temp = this.head;
    while (temp != null) {
      temp = temp.getNextNode();
      len++;
    }

    if (len < num)
      return;

    temp = this.head;

    for (int i = 0; i < (len - num); i++) {
      temp = temp.getNextNode();
    }
    System.out.println(temp.getData());

  }

}
