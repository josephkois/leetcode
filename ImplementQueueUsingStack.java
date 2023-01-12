Class MyQueue {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public myQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x){
        stack1.push(x);
    }

    public int pop() {
        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        int tempItem = stack2.pop();

        while(!stack2.empty()) {
            stack1.push(stack2.pop());
        }
        return tempItem;
    }

    public int peek() {
        while(!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        int tempItem = stack2.peek();

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }
    }

    public boolean empty() {
        return stack1.empty();
    }
}