class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>mp = new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(mp.values());

        int cnt=0;
        while(pq.size()>1){
           int curr = pq.poll();

           if(pq.peek() == curr &&  curr!=0){
            cnt++;
            pq.add(curr-1);
           }
        }
        return cnt;
    }
}