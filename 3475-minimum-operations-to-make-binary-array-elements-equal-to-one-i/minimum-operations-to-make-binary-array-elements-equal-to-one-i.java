class Solution {
    public int minOperations(int[] nums) {
        
        // if at last any ele is left as 0 return -1 else count
        int count=0;
        int n = nums.length;
        for(int i=2;i<n;i++){
            if(nums[i-2]==0){
                nums[i-2]=nums[i-2]==0?1:0;
               nums[i-1]= nums[i-1]==0?1:0;
               nums[i]= nums[i]==1?0:1;
                count++;
            }

        }
        for(int num:nums){
            if(num==0){
                return -1;
            }
        }
        return count;
    }
}