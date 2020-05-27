package list.v2.impl;

import java.util.NoSuchElementException;
import java.util.Objects;

public class LinkedListV2<E> {

  private int length;
  private Node<E> head;
  private Node<E> tail;

  public void add(E element) {
    Node<E> newNode = new Node<>(element);
    newNode.setNext(this.head);

    if (this.head == null)
      this.tail = newNode;
    else
      this.head.setPrevious(newNode);
    this.head = newNode;
    length++;
  };

  public void add(E element, int position) throws Exception {
    if (position > size())
      throw new Exception("Invalid position exception");
    if (position == 0)
      add(element);
    else {
      Node<E> current = this.head;
      for (int i = 1; i <= position; i++) {
        current = current.getNext();
      }
      Node<E> newNode = new Node<>(element);
      newNode.setPrevious(current.getPrevious());
      current.getPrevious().setNext(newNode);
      current.setPrevious(newNode);
      newNode.setNext(current);
      length++;
    }
  };

  public void addAtEnd(E element) {
  };

  public void addAtEnd(E element, int position) {
  };

  public boolean remove(E element) throws Exception {
    if (this.head.getElement() == element) {
      this.head = this.head.getNext();
    } else {
      Node<E> current = this.head;
      while (current.getNext() != null && current.getElement() != null) {
        if (current.getElement() == element) {
          current = current.getNext();
          break;
        }
        throw new NoSuchElementException("Not found");
      }
      if (current == this.tail)
        removeLast();
      else
        current.setPrevious(current.getNext());
    }
    length--;
    return true;
  };

  public E removeAt(int position) throws Exception {
    if (position > size())
      throw new Exception("Invalid position");
    if (position == 0)
      return removeLast();
    Node<E> current = this.head;
    for (int i = 1; i <= position; i++) {
      current = current.getNext();
    }
    if (current == this.tail)
      removeLast();
    else
      current.setPrevious(current.getNext());
    length--;
    return current.getElement();
  };

  public E remove() {
    E ele = removeFirst();
    length--;
    return ele;
  };

  private E removeFirst() {
    Node<E> node = this.head;
    this.head = this.head.getNext();
    return node.getElement();
  };

  private E removeLast() throws Exception {
    if (size() == 0)
      throw new Exception("No data");
    Node<E> removed = this.tail;
    this.tail = this.tail.getPrevious();
    this.tail.setNext(null);
    return removed.getElement();
  };

  public int size() {
    return length;
  };

  public boolean contains(E element) {
    return false;
  };

  public void printLinkedList() {
    StringBuilder stringBuffer = new StringBuilder();
    Node<E> current = this.head;
    while (current!= null && current.getElement() != null) {
      stringBuffer.append(current.toString()).append(" , ");
      if ((Objects.isNull(current.getNext())))
      {
        current = null;
        break;
      }
      current = current.getNext();
      }
    System.out.println(stringBuffer.toString());
  };

  public void printLinkedListInReverse() {
    StringBuilder stringBuffer = new StringBuilder();
    Node<E> current = this.tail;
    while (current!= null && current.getElement() != null) {
      stringBuffer.append(current.toString()).append(" , ");
      if (Objects.isNull(current.getPrevious()))
      {
        current = null;
        break;
      }
        current = current.getPrevious();
    }
    System.out.println(stringBuffer.toString());
  };


  public boolean removeFromEnd(int position) {
  return false;
  }

  ;

  public E findAt(int position) {
    return null;
  };

}

class Node<E> {

  private E element;
  private Node<E> next;
  private Node<E> previous;

  Node(E element) {
    this.element = element;
    this.next = null;
    this.previous = null;
  }

  public E getElement() {
    return element;
  }

  public void setElement(E element) {
    this.element = element;
  }

  public Node<E> getNext() {
    return next;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }

  public Node<E> getPrevious() {
    return previous;
  }

  public void setPrevious(Node<E> previous) {
    this.previous = previous;
  }

  @Override public String toString() {
    return element.toString();
  }
}

