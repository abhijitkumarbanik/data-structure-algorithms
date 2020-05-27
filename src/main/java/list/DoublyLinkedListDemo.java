package list;

public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList linkedList = new DoublyLinkedList();
		linkedList.addToFront(55);
		linkedList.addToFront(5);
		linkedList.addToFront(-78);
		linkedList.addToFront(-7);
		linkedList.addToFront(0);
		
		linkedList.printLinkedList();
		System.out.println("Length : "+linkedList.getLength());
		
		linkedList.addToEnd(66);
		linkedList.addToEnd(-87);
		
		linkedList.printLinkedList();
		System.out.println("Length : "+linkedList.getLength());
		
		/*linkedList.remove(0);
		System.out.println();
		linkedList.printLinkedList();
		System.out.println("Length : "+linkedList.getLength());
*/		
		System.out.println("Removed from front : "+linkedList.removeFromFront());
		linkedList.printLinkedList();
		System.out.println("Length : "+linkedList.getLength());
		
		System.out.println("Removed from end : "+linkedList.removeAtEnd());
		linkedList.printLinkedList();
		System.out.println("Length : "+linkedList.getLength());
		
	}

}
