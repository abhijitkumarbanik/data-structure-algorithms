package stack.test;

import stack.base.AbstractStack;
import stack.impl.StackArrayImpl;

public class StackArrayTest {

    public static void main(String[] args) throws Exception {

    AbstractStack stack = new StackArrayImpl<Integer>(10);
    stack.push(67);
    stack.push(-1);
    stack.push(0);
    stack.push(2);
    stack.push(47);
    stack.push(-22);

    System.out.println("Size of the stack : "+stack.size());
    stack.printStack();

    try {
      System.out.println("Peeked : "+ stack.peek());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

      System.out.println("Contains : "+ stack.contains(47));

    try {
      System.out.println("Popped : "+ stack.pop());
      System.out.println("Popped : "+ stack.pop());
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}
