class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];

        int idx=0;
        for(int i=0;i<n;i++){
          if(nums[i]<pivot){
            ans[idx++]=nums[i];
          }
        }
        for(int num:nums){
            if(num==pivot){
                ans[idx++]=num;
            }
        }
        for(int num:nums){
            if(num>pivot){
                ans[idx++]=num;
            }
        }
        return ans;
    }
}