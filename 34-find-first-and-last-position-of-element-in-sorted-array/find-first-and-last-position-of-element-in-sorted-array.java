class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = func(nums,target,true);
        int last = func(nums,target,false);

        int[] arr = new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
        }
        private int func(int[] nums,int target,boolean flag){

            int l = 0,r=nums.length-1;
            int ans=-1;
            if(flag){
              while(l<=r){
                int mid = l+(r-l)/2;
                if(nums[mid]==target) {ans = mid ; r=mid-1;}
                else if(nums[mid]<target) l=mid+1;
                else r=mid-1;
              }
            }
              else{
                while(l<=r){
                int mid = l+(r-l)/2;
                if(nums[mid]==target) {ans = mid ; l=mid+1;}
                else if(nums[mid]<target) l=mid+1;
                else r=mid-1;
              }
              
            }
            return ans;
        }
}