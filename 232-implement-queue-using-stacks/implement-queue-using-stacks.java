class MyQueue {
    List<Integer> arr;
    int front;
    int size;

    public MyQueue() {
        this.arr = new ArrayList<>();
        size = -1;
        this.front = 0;
    }
    
    public void push(int x) {
        size++;
        arr.add(x);
    }
    
    public int pop() {
        size--;
        return arr.remove(front);
        
    }
    
    public int peek() {
        return arr.get(front);
    }
    
    public boolean empty() {
        if(size == -1){
            return true;
        }
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */