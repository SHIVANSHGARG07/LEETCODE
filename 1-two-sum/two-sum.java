class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>mp = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int left = target-nums[i];
            if(mp.containsKey(left)){
                return new int[]{mp.get(left),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{};
    }
}