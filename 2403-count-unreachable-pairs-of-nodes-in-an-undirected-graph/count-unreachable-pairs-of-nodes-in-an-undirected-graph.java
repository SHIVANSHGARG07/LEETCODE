import java.util.*;

class Solution {
    private int[] parent, rank;

    private int find(int i) {
        if (parent[i] != i) {
            parent[i] = find(parent[i]); // Path compression
        }
        return parent[i];
    }

    private void union(int x, int y) {
        int px = find(x);
        int py = find(y);

        if (px == py) return;

        if (rank[px] > rank[py]) {
            parent[py] = px;
        } else if (rank[py] > rank[px]) {
            parent[px] = py;
        } else {
            parent[py] = px;
            rank[px]++;
        }
    }

    public long countPairs(int n, int[][] edges) {
        if (n == 1) return 0; // Handle single-node case

        parent = new int[n]; // Fix: Use 'n' instead of 26
        rank = new int[n];

        for (int i = 0; i < n; i++) { // Fix: Loop should run till 'n'
            parent[i] = i;
        }

        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int root = find(i);
            mp.put(root, mp.getOrDefault(root, 0) + 1);
        }

        long res = 0, remain = n;
        for (int num : mp.values()) {
            res += (long) num * (remain - num);
            remain -= num;
        }
        return res;
    }
}
