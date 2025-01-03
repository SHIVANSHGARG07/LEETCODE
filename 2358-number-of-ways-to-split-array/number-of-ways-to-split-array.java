class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;

       long totalSum=0;
       for(int num:nums){
        totalSum+=num;
       }
       int count=0;
       long sum=0;
       for(int i=0;i<n-1;i++){
        sum+=nums[i];
        if(sum>=totalSum-sum){
            count++;
        }
       }
       return count;

    }
}