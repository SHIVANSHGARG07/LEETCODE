class Solution {
    public int findMinMoves(int[] machines) {
        int sum = 0;
        int n = machines.length;
        if (n == 1)
            return 0;

        for (int num : machines) {
            sum += num;
        }
        int avg = sum / n;
        if (sum % n != 0)
            return -1;
        int maxy = 0;
        int running = 0;
        for (int i = 0; i < n; i++) {
            int diff = machines[i] - avg;
            running += diff;

            maxy = Math.max(maxy, Math.max(Math.abs(running), diff));
        }
        return maxy;

    }
}