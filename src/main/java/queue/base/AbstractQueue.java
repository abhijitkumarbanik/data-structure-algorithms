package queue.base;

import java.util.NoSuchElementException;

public interface AbstractQueue<E> {

  public boolean add(E e);

  public E remove();

  public boolean offer(E e) throws NoSuchElementException;

  public E peek();

  public E pop() throws NoSuchElementException;

  public boolean empty();

  public void printQueue();
}
