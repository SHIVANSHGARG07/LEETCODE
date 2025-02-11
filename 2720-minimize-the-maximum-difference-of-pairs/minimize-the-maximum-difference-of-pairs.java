class Solution {
    public int minimizeMax(int[] nums, int p) {
        int one =0,two=0;
        Arrays.sort(nums);
        int n = nums.length;

        two = nums[n-1]-nums[0];
        int res =0;


        while(one<two){
            int mid = one+(two-one)/2;
            if(func(nums,mid,p)){
              two=mid;
            }
            else{
                one = mid+1;
            }
        }
        return one;


    }
   private boolean func(int[] nums, int mid, int p) {
        int count = 0;
        int n = nums.length;
       for(int i=0;i<n-1;i++){
        if(nums[i+1]-nums[i]<=mid){
            count++;
            i++;
        }
       }
       return count>=p;
    }
}


/// phle toh min diff find krlo siort krke 
// uske baad max diff find krlo
// fhir binary search on that range p pairs under mid ele
// if find then go to left 
// else right 
