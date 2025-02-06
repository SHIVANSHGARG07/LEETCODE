class Solution {
    public int minimumOperations(int[] nums) {
       int sum =0;
       for(int num:nums){
        if(num%3!=0){
            int val = Math.min(num%3 , 3-(num%3));
            sum+=val;
        }
       } 
       return sum;
    }
}