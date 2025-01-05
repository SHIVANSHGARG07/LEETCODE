class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i=0,j=0;
        int n=nums.length;
        if(k==0 || k==1) return 0;
        int pro=1;
        int ans=0;
        while(j<n){
            pro*=nums[j];
            while(pro>=k){
                pro/=nums[i];
                i++;
            }
            ans+=j-i+1;
            j++;
        }
        return ans;
    }
}