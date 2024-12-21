class Solution {
    public void backtrack(int[] nums, HashSet<Integer> used, List<Integer> one, List<List<Integer>> two) {
        int n = nums.length;
        if (one.size() == n) {
            two.add(new ArrayList<>(one));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used.contains(i)) continue;
            used.add(i);
            one.add(nums[i]);

            backtrack(nums, used, one, two);
            used.remove(i);
            one.remove(one.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> two = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        HashSet<Integer> used = new HashSet<>();
        backtrack(nums, used, one, two);
        return two;
    }
}
