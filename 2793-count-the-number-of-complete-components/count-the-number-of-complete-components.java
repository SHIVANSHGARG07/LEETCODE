class Solution {
    public void dfs(List<List<Integer>> adj, int src, boolean[] vis, List<Integer> component) {
        component.add(src);
        vis[src] = true;

        for (int ne : adj.get(src)) {
            if (!vis[ne]) {
                dfs(adj, ne, vis, component);
            }
        }
    }

    public int countCompleteComponents(int n, int[][] edges) {
        // each component contains n-1 edges
        // firstly find connected components using dfs
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int ans = 0;
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {

            if (!vis[i]) {
                List<Integer> component = new ArrayList<>();

                dfs(adj, i, vis, component);
                int edgeCount = 0;
                for (int node : component) {
                    edgeCount += adj.get(node).size();
                }
                edgeCount /= 2;
                int size = component.size();
                int req = size * (size - 1) / 2;

                if (req == edgeCount) {
                    ans++;
                }

            }
        }
        return ans;
    }
}