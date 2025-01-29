class Solution {
    private void dfs(List<List<Integer>>adj,int src,boolean[] vis){
        vis[src]=true;

        for(int ne:adj.get(src)){
            if(!vis[ne]){
                dfs(adj,ne,vis);
            }
        }
    }
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer>ans = new ArrayList<>();
        int[] in = new int[n];

        for(List<Integer>edge: edges){
           in[edge.get(1)]++;
        }

        for(int i=0;i<n;i++){
            if(in[i]==0){
                ans.add(i);
            }
        }


        return ans;

    }
}