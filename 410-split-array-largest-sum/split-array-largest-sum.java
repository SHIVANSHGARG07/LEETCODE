class Solution {
    private int binary(int cap,int[] weights){
        int load=0,days=1;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                days++;
                load=weights[i];
            }
            else{
                load+=weights[i];
            }
        }
        return days;
    }
    public int splitArray(int[] nums, int k) {
       int maxy = Arrays.stream(nums).max().getAsInt();
       int total = Arrays.stream(nums).sum();

       int left=maxy,right=total;
       while(left<right){
        int mid = left+(right-left)/2;
        int days = binary(mid,nums);

        if(days<=k){
            right=mid;
        }
        else{
            left=mid+1;
        }
       } 
       return left;
    }
}