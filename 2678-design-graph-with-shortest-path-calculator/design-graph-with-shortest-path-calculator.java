class Pair {
    int first, second;

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Graph {
  private  List<List<Pair>>adj;
    public Graph(int n, int[][] edges) {
       adj = new ArrayList<>();
       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }

       for(int[] edge:edges){
        addEdge(edge);
       }
    }

    public void addEdge(int[] edge) {
       int u = edge[0];
       int v = edge[1];
       int wt = edge[2];
       adj.get(u).add(new Pair(v,wt));
    }

    public int shortestPath(int src, int dest) {
      int n = adj.size();
      ArrayList<Integer>dist = new ArrayList<>(Collections.nCopies(n,Integer.MAX_VALUE));

      dist.set(src,0);
      PriorityQueue<Pair>pq = new PriorityQueue<>(Comparator.comparingInt(a->a.second));
      pq.add(new Pair(src,0));

      while(!pq.isEmpty()){
        Pair pair = pq.poll();
        int u = pair.first;

        if(u==dest){
     return dist.get(u);
        }

        for(Pair ne:adj.get(u)){
          int v = ne.first;
          int wt = ne.second;

          if(dist.get(u)+wt<dist.get(v)){
            dist.set(v,dist.get(u)+wt);
            pq.add(new Pair(v,dist.get(v)));
          }
        }
      }
      return -1;
    }
}
