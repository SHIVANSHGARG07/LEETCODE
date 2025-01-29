class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for(int i=0;i<n;i++){
            if(color[i]==0 && !dfs(graph,color,i,1)){
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int[][] graph,int[] color,int src,int currColor){
        color[src]=currColor;

        for(int ne:graph[src]){
            if(color[ne]==0){
                if(!dfs(graph,color,ne,-currColor)){
                    return false;
                }
            }
            else if(color[ne]==color[src]){
                return false;
            }
        }
        return true;
    }
}