package Easy;

import java.util.Stack;

public class Leetcode232 {
    Stack<Integer> stack;
    Stack<Integer> dummyStack;

    public Leetcode232() {
        stack=new Stack<>();
        dummyStack=new Stack<>();
    }

    public void push(int x) {
        while(!stack.isEmpty()){
            dummyStack.push(stack.pop());
        }
        stack.push(x);
        while(!dummyStack.isEmpty()){
            stack.push(dummyStack.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
