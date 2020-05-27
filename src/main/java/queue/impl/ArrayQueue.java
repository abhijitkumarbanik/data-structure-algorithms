package queue.impl;

import queue.base.AbstractQueue;

import java.util.NoSuchElementException;

public class ArrayQueue<E> implements AbstractQueue<E> {

  private E[] data;
  private int head=0, tail=0;

  public ArrayQueue() {
    this.data = (E[]) new Object[1000];
  }

  public ArrayQueue(int initialCapacity) {
    this.data = (E[]) new Object[initialCapacity];
  }

  public boolean add(E e) {
    if(tail == data.length)
    {
      //Re-sizing to double
    }
    data[tail++] = e;
    return true;
  }

  @Override 
  public E remove() {
    if(empty())
      return null;
    E e = data[head];
    data[head] = null;
    head++;
    return e;
  }

  @Override 
  public boolean offer(E o) {
    while (!empty())
    {
      if (pop() == o)
        return true;
    }
    throw new NoSuchElementException("No element found to pop");
  }

  @Override 
  public E peek() {
    if(empty())
      return null;
    return data[head];
  }

  @Override 
  public E pop() throws NoSuchElementException{
    if(empty())
      throw new NoSuchElementException("No element found to pop");
    E e = data[head];
    data[head] = null;
    head++;
    return e;
  }

  @Override 
  public boolean empty() {
    return tail-head==0;
  }

  @Override public void printQueue() {
    for (int i=head; i<tail - head; i++)
    {
      System.out.print(data[i]+", ");
    }
    System.out.println("");
  }

}
