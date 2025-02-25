class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int even=1,odd=0,pre=0;
        int count=0;
        int n = arr.length;

        for(int i=0;i<n;i++){
             pre+=arr[i];

             if(pre%2!=0){
                count = (count+even)%mod;
                odd++;
             }
             else{
                count = (count+odd)%mod;
                even++;
             }

        }
        return count;
    }
}