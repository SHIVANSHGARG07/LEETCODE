class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        // Find the count of negative numbers
        int negCount = findFirstNonNegative(nums);

        // Find the count of positive numbers
        int posCount = n - findFirstPositive(nums);

        return Math.max(negCount, posCount);
    }

    // Binary search to find the first non-negative number
    private int findFirstNonNegative(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left; // Left points to the first non-negative number
    }

    // Binary search to find the first positive number
    private int findFirstPositive(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left; // Left points to the first positive number
    }
}
