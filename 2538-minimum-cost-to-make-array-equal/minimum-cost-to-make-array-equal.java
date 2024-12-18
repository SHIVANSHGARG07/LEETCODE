class Solution {
    public long func(int[] nums,int[] cost,int ele){
      long res =0;
      for(int i=0;i<nums.length;i++){
        res+=(long) Math.abs(nums[i]-ele)*cost[i];
      }
      return res;

    }
    public long minCost(int[] nums, int[] cost) {
        long ans=Long.MAX_VALUE;

       int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();

       while(min<=max){
        int mid = min+(max-min)/2;
        long cost1 = func(nums,cost,mid);
        long cost2 = func(nums,cost,mid+1);

        ans = Math.min(cost1,cost2);

        if(cost2>cost1){
            max = mid-1;
        }
        else{
            min = mid+1;
        }
       }
       return ans == Integer.MAX_VALUE?0:ans;
    }
}