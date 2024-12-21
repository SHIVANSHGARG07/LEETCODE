class Solution {
    public String kthLargestNumber(String[] nums, int k) {
       PriorityQueue<String>pq = new PriorityQueue<>((a,b)->{
       if(a.length()!=b.length()){
        return b.length()-a.length();
       }
       else{
        return b.compareTo(a);
       }
     } );

       for(String str:nums){
        pq.add(str);
       }
       while(k-- >1){
        pq.poll();
       }
       return pq.poll();


    }
}