class Solution {
   private void backtrack(int[] nums, int idx, List<Integer> list, Set<List<Integer>> ans) {
        ans.add(new ArrayList<>(list)); // Store unique subset

        for (int i = idx; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums, i + 1, list, ans);
            list.remove(list.size() - 1); // Backtrack
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort to handle duplicates
        Set<List<Integer>> ans = new HashSet<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return new ArrayList<>(ans); // Convert HashSet to List
    }
}