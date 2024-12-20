class Solution {
    public int sum =0;
    public void cal(int[] arr,int s,int currXor){
      if(s==arr.length){
        sum+=currXor;
        return;
      }

       cal(arr,s+1,currXor^arr[s]);
       cal(arr,s+1,currXor);
       
      
    }
    public int subsetXORSum(int[] nums) {
        cal(nums,0,0);
        return sum;
    }
}