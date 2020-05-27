package queue;

import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

/*    //Enqueue costly operation
    public void enQueue(int value)
    {
        while (!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        stack1.push(value);
        while (!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }
    }

    public int deQueue()
    {
        return stack1.isEmpty() ? -1 : stack1.pop();
    }*/

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();
        queue.enQueue(5);
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(56);
        queue.enQueue(78);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }

    public void enQueue(int value)
    {
       stack1.push(value);
    }

    public int deQueue()
    {
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        return stack2.isEmpty() ? -1 : stack2.pop();
    }
}
