class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int ans=0;
        int maxy=Integer.MIN_VALUE,miny=Integer.MAX_VALUE;
        int  forMax=0,forMin=0;

        for(int i=0;i<n;i++){
            forMax+=nums[i];
            forMin+=nums[i];

            maxy = Math.max(maxy,forMax);
            miny = Math.min(miny,forMin);

            if(forMax<0) forMax=0;
            if(forMin>0) forMin=0;
        }

        ans = Math.max(maxy,-(miny));

        return ans;
           

    }
    

}