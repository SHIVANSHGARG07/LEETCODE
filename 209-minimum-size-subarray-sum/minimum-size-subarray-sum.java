class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        // edge case 
        int sum =0;
        for(int num:nums){
            sum+=num;
        }
        if(sum<target) return 0;

        // use inside while loop while sum>= taregt shrink because i want min size 
        int l=0,r=0,n=nums.length;
        int sumy=0;
        int miny=Integer.MAX_VALUE;

        while(r<n){
         sumy+=nums[r];

         while(l<n && sumy>=target){
            miny = Math.min(miny,r-l+1);
            sumy-=nums[l];
            l++;
            
         }
       
         r++;

        }
        if(miny!=Integer.MAX_VALUE){
            return miny;
        }
        else{
            return 0;
        }

    }
}