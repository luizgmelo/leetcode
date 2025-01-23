import java.util.Stack;

public class MinimumStack {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.pop();
        minStack.push(20);
        System.out.println(minStack.top()); // return 20
        minStack.push(-20);
        System.out.println(minStack.getMin()); // return -20
    }
}

class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int minElement;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            minElement = val;
        }

        stack.push(val);

        if (val <= minElement) {
            minElement = val;
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        int val = stack.pop();
        if (val == minElement) {
            minStack.pop();
        }
        if (!minStack.isEmpty()) {
            minElement = minStack.peek();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return -1;
    }

    public int getMin() {
        if (!minStack.isEmpty()) {
            return minStack.peek();
        }
        return - 1;
    }
}