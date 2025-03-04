class Solution {
    private boolean func(int[] nums,int i,Boolean[] dp){
        int n = nums.length;
        if(i==n) return true;
        if(dp[i]!=null) return dp[i];

        boolean ans = false;
        // 2 length same ele
        if(i+1<n && nums[i]==nums[i+1]){
            ans|= func(nums,i+2,dp);
        }

        if(i+2< n && nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
            ans|= func(nums,i+3,dp);
        }

        if(i+2<n && nums[i]+1==nums[i+1] && nums[i+1]+1==nums[i+2]){
            ans|= func(nums,i+3,dp);
        }
        return dp[i]=ans;


    }
    public boolean validPartition(int[] nums) {
       // if idx == n return true means array is completed
       // 2 cases // skip or take
       // if take then two cases
       //1) arr.length == 2 or 3 and all ele should equal
      // 2) check 3 ele together
      int n = nums.length;
      Boolean[] dp = new Boolean[n];
      return func(nums,0,dp);
       

    }
}