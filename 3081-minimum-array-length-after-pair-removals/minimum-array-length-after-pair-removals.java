class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int l=0;
        int r = (int) Math.ceil(n/2.0);
        int count=0;

        while(l<n/2 && r<n){
            if(nums.get(l)<nums.get(r)){
                count+=2;
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return n-count;
    }
}