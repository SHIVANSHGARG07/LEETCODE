class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int maxy = 1;
       int miny=1;
       int ans =1;
       int  n = nums.length;
              if(n==1) return 1;


       for(int i=1;i<n;i++){
        if(nums[i]>nums[i-1]){
            maxy++;
            miny=1;
        }
        else if(nums[i]<nums[i-1]){
            maxy=1;
            miny++;
        }
        else{
            miny=1;
            maxy=1;
        }
        ans = Math.max(ans,Math.max(maxy,miny));
       }
       return ans;
    }
}