class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer>less = new ArrayList<>();
        List<Integer>big = new ArrayList<>();
        int count=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
          if(nums[i]<pivot){
            less.add(nums[i]);
          }
          else if(nums[i]==pivot){
            count++;
          }
          else{
            big.add(nums[i]);
          }

        }

        int[] ans = new int[nums.length];
        int idx=0;

        for(int i=0;i<less.size();i++){
            ans[idx++]=less.get(i);
        }

        while(count-- >0){
            ans[idx++]=pivot;
        }

        for(int i=0;i<big.size();i++){
            ans[idx++]=big.get(i);
        }

        return ans;
    }
}