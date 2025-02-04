class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxy = 0;

        int sum = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum+=nums[i];
            }
            else{
                maxy = Math.max(maxy,sum);
                sum=nums[i];
            }
        }
        maxy = Math.max(maxy,sum);
        return maxy;
    }
}