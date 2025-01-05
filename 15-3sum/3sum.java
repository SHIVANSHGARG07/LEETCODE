class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>>st = new HashSet<>();
       int n = nums.length;
       List<List<Integer>>ans = new ArrayList<>();
       Arrays.sort(nums);

       for(int i=0;i<n-2;i++){
        int low = i+1,high=n-1;

        while(low<high){
            if(nums[i]+nums[low]+nums[high]<0){
                low++;
            }
            else if(nums[i]+nums[low]+nums[high]>0){
                high--;
            }
            else{
                st.add(Arrays.asList(nums[i],nums[low],nums[high]));
                low++;
                high--;
            }
        }
       } 
       ans.addAll(st);
       return ans;
    }
}