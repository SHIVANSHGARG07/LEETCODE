class Solution {
    public int memo(int[] nums,int idx,int curr,int target){
        if(idx==nums.length){
            if(target==curr) return 1;
            else return 0;
        }
        int plus = memo(nums,idx+1,curr+nums[idx],target);
        int minus = memo(nums,idx+1,curr-nums[idx],target);
        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return memo(nums,0,0,target);
    }
}