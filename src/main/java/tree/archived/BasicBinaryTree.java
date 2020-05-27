package tree.archived;

import java.util.Objects;

public class BasicBinaryTree<T extends Comparable<T>> {

  private Node root;
  private int size;

  public int size() {
    return this.size;
  }

  public boolean insert(T element) throws Exception {
    if (Objects.isNull(element)) {
      throw new Exception("Null cannot be stored");
    }
    Node newNode = new Node(element);
    if (Objects.isNull(this.root)) {
      this.root = newNode;
    } else {
      insert(this.root, newNode);
    }
    size++;
    return true;
  }

  private boolean insert(Node parent, Node child) {
    if (parent.getElement().compareTo(child.getElement()) > 0) {
      if (Objects.isNull(parent.getLeft())) {
        parent.setLeft(child);
        parent.setParent(parent);
      } else
        insert(parent.getLeft(), child);
    } else if (parent.getElement().compareTo(child.getElement()) < 0) {
      if (Objects.isNull(parent.getRight())) {
        parent.setRight(child);
        parent.setParent(parent);
      } else
        insert(parent.getRight(), child);
    } else {
      //Skipped equal nodes
    }
    return true;
  }

  public void inOrderTraversal() {
    if (this.root != null) {
      inOrderTraversal(root);
    }
  }

  private void inOrderTraversal(Node head) {
    if (head.getLeft() != null && head.getLeft().getElement() != null) {
      inOrderTraversal(head.getLeft());
    }
    System.out.print(head.getElement() + " , ");
    if (head.getRight() != null && head.getRight().getElement() != null) {
      inOrderTraversal(head.getRight());
    }
  }

  public void preOrderTraversal() {
    if (this.root != null) {
      preOrderTraversal(root);
    }
  }

  private void preOrderTraversal(Node head) {
    System.out.print(head.getElement() + " , ");
    if (head.getLeft() != null && head.getLeft().getElement() != null) {
      preOrderTraversal(head.getLeft());
    }

    if (head.getRight() != null && head.getRight().getElement() != null) {
      preOrderTraversal(head.getRight());
    }
  }

  public void postOrderTraversal() {
    if (this.root != null) {
      postOrderTraversal(root);
    }
  }

  private void postOrderTraversal(Node head) {
    if (head.getLeft() != null && head.getLeft().getElement() != null) {
      postOrderTraversal(head.getLeft());
    }

    if (head.getRight() != null && head.getRight().getElement() != null) {
      postOrderTraversal(head.getRight());
    }
    System.out.print(head.getElement() + " , ");
  }

  public boolean contains(T element) {
    return Objects.nonNull(getNode(root, element));
  }

  public Node getNode(Node node, T element) {
    if (node.getElement().equals(element))
      return node;
    else {
      if (element.compareTo((T) node.getElement()) < 0) {
        if (node.getLeft() != null) {
          return getNode(node.getLeft(), element);
        }
      } else if (element.compareTo((T) node.getElement()) > 0) {
        if (node.getRight() != null) {
          return getNode(node.getRight(), element);
        }
      }
      return null;
    }
  }

  public boolean delete(T element) {
    return false;
  }

  private void unlink(Node current, Node newNode)
  {
    //if(current)
  }

  public T min() {
    return min(root);
  }

  private T min(Node node){
    if (node.getLeft()!=null)
      return min(node.getLeft());
    return (T)node.getElement();
  }

  public T max() {
    return max(root);
  }

  private T max(Node node){
    if (node.getRight()!=null)
      return max(node.getRight());
    return (T)node.getElement();
  }
}

class Node<T extends Comparable<T>> {
  private Node left;
  private Node right;
  private Node parent;
  private T element;

  Node(T element) {
    this.left = null;
    this.right = null;
    this.parent = null;
    this.element = element;
  }

  public Node getLeft() {
    return left;
  }

  public void setLeft(Node left) {
    this.left = left;
  }

  public Node getRight() {
    return right;
  }

  public void setRight(Node right) {
    this.right = right;
  }

  public Node getParent() {
    return parent;
  }

  public void setParent(Node parent) {
    this.parent = parent;
  }

  public T getElement() {
    return element;
  }

  public void setElement(T element) {
    this.element = element;
  }
}
