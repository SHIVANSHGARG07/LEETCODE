class Solution {
    public void dfs(List<List<Integer>>adj,int src,boolean[] vis){
        vis[src]=true;
        for(int ne:adj.get(src)){
            if(!vis[ne]){
                dfs(adj,ne,vis);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
      List<List<Integer>>adj = new ArrayList<>();
      for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
      }  

      for(int[] edge:edges){
        adj.get(edge[0]).add(edge[1]);
        adj.get(edge[1]).add(edge[0]);
      }
boolean[] vis = new boolean[n];
      dfs(adj, source,vis);
      return vis[destination];
    }
}