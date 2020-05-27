package queue;

public class ArrayQueueDemo {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(10);
		queue.add(-762);
		queue.add(0);
		queue.add(-2);
		queue.add(87);
		queue.add(1);
		queue.add(567);
		
		queue.printQueue();
		
		System.out.println("Peeked : "+queue.peek());
		System.out.println("Peeked : "+queue.peek());
		
		queue.printQueue();
		
		System.out.println("Popped : "+queue.pop());
		System.out.println("Popped : "+queue.pop());
		
		queue.printQueue();

	}

}
