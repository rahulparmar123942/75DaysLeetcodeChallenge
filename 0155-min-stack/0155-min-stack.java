class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long value = val;

        if(st.isEmpty()) {
            st.push(value);
            min = value;
        }
        else if(value >= min) {
            st.push(value);
        }
        else {
            st.push(2 * value - min);
            min = value;
        }
    }

    public void pop() {
        if(st.peek() < min) {
            min = 2 * min - st.peek();
        }

        st.pop();

        if(st.isEmpty()) {
            min = Long.MAX_VALUE;
        }
    }

    public int top() {
        long x = st.peek();

        if(x < min) {
            return (int) min;
        }

        return (int) x;
    }

    public int getMin() {
        return (int) min;
    }
}