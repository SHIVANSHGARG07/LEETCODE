class Solution {
    private int binary(int cap, int[] weights) {
        int days = 1, load = 0;
        int n = weights.length;
        for (int i = 0; i < n; i++) {
            if (load + weights[i] > cap) {
                days++;
                load = weights[i];  
            } else {
                load += weights[i];  // add to the current shipment
            }
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int k) {
        int maxy = Arrays.stream(weights).max().getAsInt();
        int totalSum = Arrays.stream(weights).sum();

        int left = maxy, right = totalSum;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int days = binary(mid, weights);
            
            if (days <= k) {
                right = mid-1;  
            } else {
                left = mid + 1;  
            }
        }
        return left;  
    }
}
