class Solution {
    public long minCost(int[] nums, int[] cost) {
     // cond 1  // if not any ele is diff return 0
      //  cond 2 // must be less than in O(n2)

      // sort both arrays but in relational basis 
      // find weighted mean like prefixSum for cost array and where array exceed sum than half at that 
      // at that index it sholud be the target

     int n = nums.length;
      int[][] pairs = new int[n][2];

      for(int i=0;i<n;i++){
        pairs[i][0]=nums[i];
        pairs[i][1]=cost[i];
      }
      Arrays.sort(pairs,(a,b)->Integer.compare(a[0],b[0]));

      long sum=0;

      for(int num:cost){
        sum+=num;
      }

      long curr =0;
      int idx=-1;

      for(int i=0;i<n;i++){
        curr+=pairs[i][1];

        if(curr*2>=sum){
            idx=i;
            break;
        }
      }

      // now i have to convert to idxth ele 
      int target = pairs[idx][0];
      long ans=0;

      for(int i=0;i<idx;i++){
        ans += (long) (target-pairs[i][0]) * pairs[i][1];
      }

      for(int i=idx+1;i<n;i++){
        ans+=(long) (pairs[i][0]-target)*pairs[i][1];
      }



return ans;

    }
}