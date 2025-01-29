class Solution {
    public boolean dfs(List<List<Integer>>adj,int src,int parent,boolean[] vis){
        vis[src]=true;

        for(int ne:adj.get(src)){
              if(!vis[ne]){
                if(dfs(adj,ne,src,vis)){
                    return true;
                }
              }
              else if(parent!=ne){
                return true;
              }
        }
        return false;
    }
    public boolean cycle(List<List<Integer>>adj ){
        int n = adj.size();
        boolean[] vis = new boolean[n+1];

        for(int i=1;i<n;i++){
            if(!vis[i]){
             if(dfs(adj,i,-1,vis)){
                return true;
             }
            }
        }
        return false;
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
         adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
          
          if(cycle(adj)){
            return edge;
          }
        }
        return new int[]{0,0};
    }
}






