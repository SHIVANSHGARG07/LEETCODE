class Solution {
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * 10000 + nums[i + n];
        }

        int idx = 2 * n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int y = nums[i] % 10000; 
            int x = nums[i] / 10000;  
            nums[idx--] = y;
            nums[idx--] = x;
        }

        return nums;
    }
}
