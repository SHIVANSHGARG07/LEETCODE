class Solution {
    private int func(int[]nums,int target){
        int l=0;
        int r=0;
        int maxy = -1;
        int sum=0;
        int n = nums.length;
        while(r<n){
            sum+=nums[r];

            while(sum>target){
                sum-=nums[l];
                l++;
            }
            if(sum==target){
            maxy = Math.max(maxy,r-l+1);
            }
            r++;
        }
        return maxy;
    }
    public int minOperations(int[] nums, int x) {
      int count=0;
      int n = nums.length;
      int i=0,j=n-1;
      int sum =0;
      for(int num:nums){
        sum+=num;
      }
      if(sum<x){
        return -1;
      }
      int len = func(nums,sum-x);
      if(len<0) return -1;
      else
       return n-len;
    }
}


// longest subarray with target sum 
