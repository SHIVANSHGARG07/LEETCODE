class RecentCounter {
 private Queue<Integer>pq;
    public RecentCounter() {
        pq = new LinkedList<>();
    }
    
    public int ping(int t) {
        pq.add(t);
        while( pq.peek()<t-3000){
            pq.poll();
        }
        return pq.size();

    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */