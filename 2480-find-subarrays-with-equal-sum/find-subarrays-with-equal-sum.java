class Solution {
    public boolean findSubarrays(int[] nums) {
      HashSet<Integer>st = new HashSet<>();
      int n = nums.length;
      for(int i=0;i<n-1;i++){
       int sum = nums[i]+nums[i+1];
        if(!st.add(sum)) return true;
        st.add(sum);
      }
      return false;
    }
}