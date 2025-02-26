class MinStack {
    public Stack<Integer> stac;
    public Stack<Integer> minStac;

    public MinStack() {
        stac = new Stack<>();
        minStac = new Stack<>();
    }
    
    public void push(int val) {
        stac.push(val);
        if (minStac.isEmpty() || val<=minStac.peek()) {
            minStac.push(val);
        }
    }
    
    public void pop() {
        int a = minStac.peek();
        if (stac.pop()==a) {
            minStac.pop();
        }
    }
    
    public int top() {
        return stac.peek();
    }
    
    public int getMin() {
        return minStac.peek();
    }
}
