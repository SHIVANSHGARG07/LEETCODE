class Solution {
    public void swap(int one,int two){
        int temp = one;
        one = two;
        two=temp;
    }
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
       

       for(int i=1;i<n-1;){
        double avg = (double)(nums[i-1]+nums[i+1])/2;
        if(avg == (double)nums[i] ){
            int temp = nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;
            if(i!=1) i--;
        }
        else i++;

       }
       return nums;

       
    }
}