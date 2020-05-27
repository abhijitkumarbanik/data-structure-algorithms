package list;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		SinglyLinkedList linkedList = new SinglyLinkedList();
		/*linkedList.add(562);
		linkedList.add(5);
		linkedList.add(-78);
		linkedList.add(-7);
		linkedList.add(0);
		
		linkedList.printLinkedList();
		*/
		linkedList = new SinglyLinkedList();
		
		linkedList.addAtEnd(562);
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(-78);
		linkedList.addAtEnd(-7);
		linkedList.addAtEnd(0);
		
		linkedList.printLinkedList();
		System.out.println();
		linkedList.getNthFromEnd(1);
		/*System.out.println(linkedList.getLength());
		
		linkedList.remove(0);
		System.out.println();
		linkedList.printLinkedList();
		System.out.println(linkedList.getLength());
		
		linkedList.remove(-78);
		System.out.println();
		linkedList.printLinkedList();
		System.out.println(linkedList.getLength());*/
		
		//System.out.println(linkedList.getNthNode(3));
		/*
		linkedList.reverseLinkedList();
		System.out.println();
		linkedList.printLinkedList();

*/
	}

}
