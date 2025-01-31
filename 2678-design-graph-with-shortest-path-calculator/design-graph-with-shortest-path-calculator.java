import java.util.*;

class iPair {
    int first, second;

    iPair(int f, int s) {
        first = f;
        second = s;
    }
}

class Graph {
    private List<List<iPair>> adj;

    // Constructor initializes the adjacency list for the graph
    public Graph(int n, int[][] edges) {
        adj = new ArrayList<>();
        
        // Initialize the adjacency list with empty lists for each node
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add the edges to the adjacency list
        for (int[] edge : edges) {
            addEdge(edge);
        }
    }

    // Add an edge from node u to v with a given weight
    public void addEdge(int[] edge) {
        int u = edge[0];
        int v = edge[1];
        int wt = edge[2];
        adj.get(u).add(new iPair(v, wt));
    }

    // Dijkstra's algorithm to find the shortest path from src to dest
    public int shortestPath(int src, int dest) {
        int n = adj.size();
        ArrayList<Integer> dist = new ArrayList<>(Collections.nCopies(n, Integer.MAX_VALUE));
        dist.set(src, 0);

        PriorityQueue<iPair> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.second));
        pq.add(new iPair(src, 0));

        while (!pq.isEmpty()) {
            iPair pair = pq.poll();
            int u = pair.first;

            if (u == dest) {
                return dist.get(u); // Return the distance to destination node
            }

            for (iPair ne : adj.get(u)) {
                int v = ne.first;
                int weight = ne.second;

                // Relaxation step for Dijkstra's algorithm
                if (dist.get(u) + weight < dist.get(v)) {
                    dist.set(v, dist.get(u) + weight);
                    pq.add(new iPair(v, dist.get(v)));
                }
            }
        }

        // If destination is not reachable, return -1
        return -1;
    }
}
