class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minNum;

    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack<>();
        minNum = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if (minNum.isEmpty()) {
           minNum.push(x); 
        } else {
            minNum.push((x < minNum.peek())?x:minNum.peek());
        }
    }
    
    public void pop() {
        stack.pop();
        minNum.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int min() {
        return minNum.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
