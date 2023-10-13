class StockSpanner {
    class Pair {
        int price;
        int idx;
    }
    
    Stack<Pair> st;
    int t = 0;
    public StockSpanner() {
        st = new Stack<>();
        Pair base = new Pair();
        base.price = 100000 + 1;
        base.idx = -1;
        st.push(base);
    }
    
    public int next(int price) {
        Pair p = new Pair();
        p.price = price;
        p.idx = t;
        t++;
        
        while(st.peek().price <= p.price) st.pop();
        int ans = p.idx - st.peek().idx;
        st.push(p);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */