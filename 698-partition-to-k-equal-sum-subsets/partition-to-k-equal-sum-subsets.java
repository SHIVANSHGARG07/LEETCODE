class Solution {
public boolean solve(int[] nums,int k,boolean[] visited , int start,int currsum,int target){
     if(k==0){
        return true;
     }
     //i found 1 value reintilaisse all
     if(currsum == target){
        return solve(nums,k-1,visited,0,0,target);
     }
     for(int i=start;i<nums.length;i++){
        if(currsum+nums[i] > target || visited[i] ){
         continue;
        }
        visited[i]=true;
        if(solve(nums,k,visited,i+1,currsum+nums[i],target)){
            return true;
        }
        visited[i]=false;
     }
     return false;

    }
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%k!=0){
            return false;
        }
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        return solve(nums,k,visited,0,0,sum/k);
    }
}