class Pair
{
    int key,value;
    Pair(int key,int value){
        this.key = key;
        this.value = value;
    }
}
class MinStack {

    Stack<Pair> stack = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        int min= stack.isEmpty() ? val : Math.min(val,stack.peek().value);
        stack.push(new Pair(val,min));
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().key;
    }
    
    public int getMin() {
        return stack.peek().value;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */