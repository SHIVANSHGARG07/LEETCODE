class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
        int first =-1,last=-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                first = mid;
                e=mid-1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
               e=mid-1; 
            }
        }
        
        s=0;
        e=nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]==target){
                last = mid;
                s=mid+1;
            }
            else if(nums[mid]<target){
                s=mid+1;
            }
            else{
               e=mid-1; 
            }
        }
        int[]res = new int[2];
        res[0]=first;
        res[1]=last;
        return res;
    }
}