class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack <>();
        minSt = new Stack <>();
        
    }
    
    public void push(int value) {
        st.push(value);
        if(minSt.isEmpty() || minSt.peek() >= value){
            minSt.push(value);
        }
    }
    
    public void pop() {
        int removed = st.pop();
        if(removed == minSt.peek()){
            minSt.pop();
        }
        
    }
    
    public int top() {
       return st.peek();
        
    }
    
    public int getMin() {
       return minSt.peek();
        
    }
}