package queue.app;

import queue.base.AbstractQueue;
import queue.impl.ArrayQueue;
import queue.impl.LinkedListQueue;

public class LinkedListQueueApp {

  public static void main(String[] args) {
    AbstractQueue queue = new LinkedListQueue();
    queue.add(-762);
    queue.add(0);
    queue.add(-2);
    queue.add(87);
    queue.add(1);
    queue.add(567);

    queue.printQueue();

    System.out.println("Removed : " + queue.remove());
    System.out.println("Removed : " + queue.remove());

    queue.printQueue();
  }
}
