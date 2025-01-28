import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            adj.get(pre[1]).add(pre[0]);
            inDegree[pre[0]]++;  // Increase in-degree for dependent course
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {  // Courses without prerequisites
                queue.add(i);
            }
        }

        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;

            for (int neighbor : adj.get(course)) {
                inDegree[neighbor]--;  // Reduce dependency
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
        return count == numCourses;  // If we processed all courses, return true
    }
}
