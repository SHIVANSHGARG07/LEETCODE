class Pair{
   int first;
   int second;
   public Pair(int first,int second){
    this.first = first;
    this.second = second;
   }
}
class Solution {
    private List<Integer> dijkstras(List<List<Pair>>adj ,int n,int k){
     // make arraylist max value 
     // src with 0 value
     // make pq on basis on second
     List<Integer>list = new ArrayList<>();
     for(int i=0;i<=n;i++){
        list.add(Integer.MAX_VALUE);
     }
     list.set(k,0);
     PriorityQueue<Pair>pq = new PriorityQueue<>(Comparator.comparingInt(a->a.second));

     pq.add(new Pair(k,0));
     while(!pq.isEmpty()){
      Pair pair = pq.poll();
      int u = pair.first;
      for(Pair neigh:adj.get(u)){
        int v = neigh.first;
        int dist = neigh.second;
        if(list.get(u)+dist<list.get(v)){
            list.set(v,list.get(u)+dist);
            pq.add(new Pair(v,list.get(u)+dist));
        }
      }
     }
     return list;
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>>adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:times){
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            adj.get(u).add(new Pair(v,wt));
        }

        List<Integer>ans = dijkstras(adj,n,k);
        int maxy=0;
        for(int i=1;i<=n;i++){
            if(ans.get(i)==Integer.MAX_VALUE){
                return -1;
            }
            else{
                maxy = Math.max(maxy,ans.get(i));
            }
        }
        return maxy;
    }
}