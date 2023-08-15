import java.util.Deque;
import java.util.Stack;

class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()){
            return stack2.pop();
        }
        throw new IllegalArgumentException("Queue is empty.");
    }

    public int peek() {
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()){
            return  stack2.peek();
        }
        throw new IllegalArgumentException("Queue is empty.");
    }

    public boolean empty() {
        if (stack2.isEmpty() && stack1.isEmpty())return true;
        return false;
    }
}

public class _232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        System.out.println(myQueue.peek());
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
//        System.out.println(myQueue.peek());
        myQueue.peek(); // return 1
//        System.out.println(myQueue.pop());
        myQueue.pop(); // return 1, queue is [2]
        System.out.println(myQueue.empty());
//        myQueue.empty(); // return false
    }
}
