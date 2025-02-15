import java.util.*;

class Solution {
    class Edge {
        int u, v, weight;
        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    // Disjoint Set Union (DSU) with path compression & union by rank
    class DSU {
        int[] parent, rank;
        
        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);  // Path compression
            }
            return parent[x];
        }

        boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) return false; // Already connected

            // Union by rank
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = rootY;
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
            }
            return true;
        }
    }

    public int minCostConnectPoints(int[][] points) {
        int V = points.length;
        List<Edge> edges = new ArrayList<>();

        // Step 1: Create an edge list with Manhattan distance as weight
        for (int i = 0; i < V; i++) {
            for (int j = i + 1; j < V; j++) {
                int weight = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new Edge(i, j, weight));
            }
        }

        // Step 2: Sort edges by weight
        edges.sort(Comparator.comparingInt(e -> e.weight));

        // Step 3: Use DSU to find MST
        DSU dsu = new DSU(V);
        int mstWeight = 0;
        int edgesUsed = 0;

        for (Edge edge : edges) {
            if (dsu.union(edge.u, edge.v)) { // If adding edge doesn't form a cycle
                mstWeight += edge.weight;
                edgesUsed++;
                if (edgesUsed == V - 1) break; // MST is formed
            }
        }

        return mstWeight;
    }
}
