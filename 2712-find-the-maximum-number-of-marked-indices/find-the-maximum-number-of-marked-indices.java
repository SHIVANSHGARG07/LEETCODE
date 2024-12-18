class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        // esmien hmein sochna hai ki left wala ele * 2 <= right 
        // agar last se krte toh bht ineffiecitn hojata  toh middle se kiya ki dekhte hai 
        Arrays.sort(nums);
        int n = nums.length;
        int l=0;
int r = (int) Math.ceil(n / 2.0);
        int count=0;
        while(l<n/2 && r<n){
            if(2*nums[l]<=nums[r]){
           count+=2;
           l++;
           r++;
            }
            else{
                // go for greater
                r++;
            }
        }
        return count;

    }
}