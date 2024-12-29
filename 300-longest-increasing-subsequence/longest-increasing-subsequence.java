class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[]dp = new int[n];

        for(int i=0;i<nums.length;i++){
            Arrays.fill(dp,1);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[j]+1,dp[i]);
                }
            }
        }
        int max=0;
        for(int i=0;i<dp.length;i++){
         if (dp[i] > max) {
                max = dp[i];
            }   
        }
      return max;
    }
}

