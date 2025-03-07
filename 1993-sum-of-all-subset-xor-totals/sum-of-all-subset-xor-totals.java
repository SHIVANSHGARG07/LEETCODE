class Solution {
    private int sum =0;
    private void back(int[] nums,int idx,int curr){
      if(idx==nums.length){
        sum+=curr;
        return;
      }

      back(nums,idx+1,curr^nums[idx]);
      back(nums,idx+1,curr);
    }
    public int subsetXORSum(int[] nums) {
        back(nums,0,0);
   return sum;
    }
}