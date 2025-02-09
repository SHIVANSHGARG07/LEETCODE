class Solution {
    private int[] parent;
    private int[] rank;

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return; // Already connected

        if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
    }

    public int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) return -1; // Not enough edges

        parent = new int[n];
        rank = new int[n];

        // Initialize parent and rank
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        int components = n;
        for (int[] connection : connections) {
            if (find(connection[0]) != find(connection[1])) {
                components--; // Reduce components if union is successful
                union(connection[0], connection[1]);
            }
        }

        return components - 1;
    }
}
