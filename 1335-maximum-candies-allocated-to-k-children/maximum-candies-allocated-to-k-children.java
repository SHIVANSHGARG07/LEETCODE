class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        long sum =0;
        int ans =0;
        int n = candies.length;
        int max=Integer.MIN_VALUE;

        for(int num:candies){
            sum+=num;
            max = Math.max(num,max);
        }
        if(sum<k){
            return 0;
        }
       
       int left=1,right=max;
       while(left<=right){
        int mid = left+(right-left)/2;

        if(func(candies,mid,k)){
            ans = mid;
            left = mid+1;
        }
        else{
            right = mid-1;
        }
       }
       return ans; 
    }
    private boolean func(int[] candies,int val,long k){
        long count=0;

        for(int candy:candies){
            count+= candy/val;
        }
   return count>=k;
    }

    
}