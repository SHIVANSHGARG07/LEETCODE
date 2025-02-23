class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
    Double.compare((double) a[0] / a[1], (double) b[0] / b[1])
);

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pq.add(new int[] { arr[i], arr[j] });
            }
        }

        for (int i = 0; i < k - 1; i++) {
            pq.poll();  // Remove k-1 smallest elements
        }

        return pq.poll(); 
    }
}