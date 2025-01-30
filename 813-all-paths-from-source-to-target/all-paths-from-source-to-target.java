class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void dfs(List<List<Integer>> adj, int src, int dest, List<Integer> list) {

        list.add(src);

        if (src == dest) {
            ans.add(new ArrayList<>(list));
        } else {
            for (int ne : adj.get(src)) {
                dfs(adj, ne, dest, list);
            }
        }
        list.remove(list.size() - 1);

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> adj = new ArrayList<>();

        int n = graph.length;
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());

        }
        for (int i = 0; i < n; i++) {
            int[] edge = graph[i];
            for (int v : edge) {
                adj.get(i).add(v);
            }
        }

        // adj list is made upto here
        // now do dfs and from 0 to n-1 do dfs
        // add in 2d list and return

        dfs(adj, 0, n - 1, new ArrayList<>());
        return ans;

    }
}