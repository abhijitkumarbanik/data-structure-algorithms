package list.v2.app;

import list.DoublyLinkedList;
import list.v2.impl.LinkedListV2;

public class LinkedListV2App {

  public static void main(String[] args) throws Exception {
    LinkedListV2<Integer> linkedList = new LinkedListV2<Integer>();
    linkedList.add(55);
    linkedList.add(5);
    linkedList.add(-78);
    linkedList.add(-7);
    linkedList.add(0);

    linkedList.printLinkedList();
    System.out.println("Length : "+linkedList.size());
    linkedList.printLinkedListInReverse();

    /*linkedList.addAtEnd(66);
    linkedList.printLinkedList();
    linkedList.printLinkedListInReverse();
*/
    System.out.println("Added ");
    linkedList.add(18, 3);
    linkedList.printLinkedList();
    System.out.println("Length : "+linkedList.size());

    System.out.println("Removed "+ linkedList.remove(0));
		linkedList.printLinkedList();
		System.out.println("Length : "+linkedList.size());

    System.out.println("Removed "+ linkedList.remove());
    linkedList.printLinkedList();
    System.out.println("Length : "+linkedList.size());

    System.out.println("Removed "+ linkedList.removeAt(2));
    linkedList.printLinkedList();
    System.out.println("Length : "+linkedList.size());


/*

    System.out.println("Removed from front : "+linkedList.removeFromFront());
    linkedList.printLinkedList();
    System.out.println("Length : "+linkedList.getLength());

    System.out.println("Removed from end : "+linkedList.removeAtEnd());
    linkedList.printLinkedList();
    System.out.println("Length : "+linkedList.getLength());
*/


  }

}
