class Solution {
    public long minCost(int[] nums, int[] cost) {
        int n = nums.length;
        int[][] arr = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=cost[i];
        }

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        int idx=-1;
        long sum = Arrays.stream(cost).asLongStream().sum(); // Total cost sum
        long curr=0;
        

        for(int i=0;i<n;i++){
            curr+=arr[i][1];

            if(curr*2>=sum){
                idx=i;
                break;
            }
        }

        // found idx;
        int target = arr[idx][0];
        long ans=0;

        for(int i=0;i<idx;i++){
        ans += (long) (target-arr[i][0]) * arr[i][1];
      }

      for(int i=idx+1;i<n;i++){
        ans+=(long) (arr[i][0]-target)*arr[i][1];
      }


return ans;
    }
}