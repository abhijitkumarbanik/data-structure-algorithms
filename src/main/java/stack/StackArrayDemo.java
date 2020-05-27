package stack;

public class StackArrayDemo {

	public static void main(String[] args) {
		
		StackArray stack = new StackArray(10);
		stack.push(67);
		stack.push(-1);
		stack.push(0);
		stack.push(2);
		stack.push(47);
		stack.push(-22);
		
		stack.printStack();
		
		try {
			System.out.println("Peeked : "+ stack.peek());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		stack.printStack();
		
		try {
			System.out.println("Popped : "+ stack.pop());
			System.out.println("Popped : "+ stack.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		stack.printStack();
	}

}
