class Solution {
    public int dfs(List<List<Integer>>adj,int src,HashSet<Integer>st,boolean[] vis){
        if(st.contains(src) || vis[src]==true){
            return 0;
        }

        int count =1;
        vis[src]=true;
        for(int ne:adj.get(src)){
            count+=dfs(adj,ne,st,vis);
        }
        return count;
        
    }
    public int reachableNodes(int n, int[][] edges, int[] restricted) {
        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int [] edge:edges){
          int u = edge[0];
          int v = edge[1];

          adj.get(u).add(v);
          adj.get(v).add(u);
        }

        HashSet<Integer>st = new HashSet<>();
        for(int num:restricted){
            st.add(num);
        }
        boolean[] vis = new boolean[n];

        int count = dfs(adj,0,st,vis);
        return count;





        
    }
}