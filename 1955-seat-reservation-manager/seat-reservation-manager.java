class SeatManager {
   PriorityQueue<Integer>pq ;
   HashSet<Integer>st ;

    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        st = new HashSet<>();
        for(int i=1;i<=n;i++){
            pq.add(i);
        }

    }
    
    public int reserve() {
        
       if(!pq.isEmpty()){
        int num = pq.poll();
        st.add(num);
        return num;
       }
       else{
        return -1;
       }
    }
    
    public void unreserve(int seatNumber) {
        if(st.contains(seatNumber)){
            st.remove(seatNumber);
        }
        pq.add(seatNumber);
    }
}

