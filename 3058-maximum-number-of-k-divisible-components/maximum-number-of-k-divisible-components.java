class Solution {
    private List<List<Integer>> graph;
    private int[] values;
    private int k;
    private int maxComponents;

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        // Input validation
        if (n <= 0 || values == null || values.length != n || k <= 0) {
            return 0;
        }

        // Initialize class variables
        this.values = values;
        this.k = k;
        this.maxComponents = 0; // We'll count components during DFS
        
        // Build adjacency list representation of the tree
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Build undirected graph
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        
        // Start DFS from node 0 (root)
        long sum = dfs(0, -1);
        if (sum % k == 0) maxComponents++; // Check the entire tree
        
        return maxComponents;
    }

    private long dfs(int node, int parent) {
        long subtreeSum = values[node];
        
        // Process all neighbors except parent
        for (int neighbor : graph.get(node)) {
            if (neighbor != parent) {
                long childSum = dfs(neighbor, node);
                if (childSum % k == 0) {
                    maxComponents++;
                }
                subtreeSum += childSum;
            }
        }
        
        return subtreeSum;
    }
}
