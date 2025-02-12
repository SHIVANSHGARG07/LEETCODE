class Pair{
    int node;
    int dist;
    public Pair(int node,int dist){
        this.node = node;
        this.dist=dist;
    }
}

class Solution {
    private int prims(List<List<Pair>>adj,int V){
        PriorityQueue<Pair>pq = new PriorityQueue<>(Comparator.comparingInt(a->a.dist));
        pq.add(new Pair(0,0));

        boolean[] vis = new boolean[V];
        int sum =0;

        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int v = p.node;
            int wt = p.dist;

            if(vis[v]) continue;

            vis[v]=true;
            sum+=wt;

            for(Pair pair:adj.get(v)){
                int a = pair.node;
                int b = pair.dist;

                if(!vis[a]){
                    pq.add(new Pair(a,b));
                }
            }

        }
        return sum;
    }
    public int minCostConnectPoints(int[][] points) {
        int V = points.length;
        List<List<Pair>>adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<V;i++){
            for(int j=i+1;j<V;j++){
                int x1 = points[i][0];
                int x2 = points[i][1];

                int y1=points[j][0];
                int y2 = points[j][1];

                int wt = Math.abs(y2-x2)+Math.abs(x1-y1);
                adj.get(i).add(new Pair(j,wt));
                adj.get(j).add(new Pair(i,wt));
            }
        }
        return prims(adj,V);

    }
}