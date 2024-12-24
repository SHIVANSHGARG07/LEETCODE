class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int miny = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i=1;i<n;i++){
                miny = Math.min(miny,nums[i]-nums[i-1]);
            
        }
        return miny;
    }
}