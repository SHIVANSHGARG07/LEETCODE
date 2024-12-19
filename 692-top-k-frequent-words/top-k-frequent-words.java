class Pair{
    String str;
    int frq;
    public Pair(String str,int frq){
        this.str = str;
        this.frq = frq;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>mp = new HashMap<>();
        for(String st:words){
            mp.put(st,mp.getOrDefault(st,0)+1);
        }

        PriorityQueue<Pair>pq = new PriorityQueue<>((a,b)->{
            if(a.frq == b.frq){
                return a.str.compareTo(b.str);
            }
            else{
                return Integer.compare(b.frq,a.frq);
            }
        });

        for(String key:mp.keySet()){
            pq.add(new Pair(key,mp.get(key)));
        }
List<String>ans = new ArrayList<>();
        while(k-- >0){
          Pair curr = pq.poll();
          ans.add(curr.str);
        }
        return ans;
    }
}