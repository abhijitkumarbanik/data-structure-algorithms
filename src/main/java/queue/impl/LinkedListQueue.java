package queue.impl;

import queue.base.AbstractQueue;

import java.util.NoSuchElementException;

public class LinkedListQueue<E> implements AbstractQueue<E> {

  private int total;

  private Node first, last;

  @Override public boolean add(E e) {
    Node current = last;
    last = new Node();
    last.ele = e;

    if (total++ == 0)
      first = last;
    else
      current.next = last;

    return true;
  }

  @Override public E remove() {
    if (total == 0)
      throw new java.util.NoSuchElementException();
    E ele = first.ele;
    first = first.next;
    if (--total == 0)
      last = null;
    return ele;
  }

  @Override public boolean offer(E e) throws NoSuchElementException {
    return false;
  }

  @Override public E peek() {
    return null;
  }

  @Override public E pop() throws NoSuchElementException {
    return null;
  }

  @Override public boolean empty() {
    return false;
  }

  @Override
  public void printQueue() {
    StringBuilder sb = new StringBuilder();
    Node tmp = first;
    while (tmp != null) {
      sb.append(tmp.ele).append(", ");
      tmp = tmp.next;
    }
    System.out.println(sb.toString());
  }

  private class Node {
    private E ele;
    private Node next;
  }
}

