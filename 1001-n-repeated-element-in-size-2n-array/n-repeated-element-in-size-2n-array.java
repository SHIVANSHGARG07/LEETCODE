class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int ans = -1;

        for (int num : nums) {
            if (!seen.add(num)) {
                ans = num;
            }
        }
        return ans;
    }
}