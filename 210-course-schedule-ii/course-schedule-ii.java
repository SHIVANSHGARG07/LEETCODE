class Solution {
    public int[] findOrder(int n, int[][] edges) {
        int[] in = new int[n];

        List<List<Integer>>adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[]edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(v).add(u);
            in[u]++;
        }

        Queue<Integer>q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==0){
                q.add(i);
            }
        }

       List<Integer>ans=new ArrayList<>();

       while(!q.isEmpty()){
        int node = q.poll();
        ans.add(node);
        for(int ne:adj.get(node)){
            in[ne]--;
            if(in[ne]==0){
            q.add(ne);
            }
        }
       }
        int[] array = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            array[i] = ans.get(i);
        }
        if(array.length==n){
            return array;
        }
       return new int[]{};
    }
}