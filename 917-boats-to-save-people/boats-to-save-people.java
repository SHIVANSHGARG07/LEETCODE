class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int count=0;
        int n = arr.length;
        int i=0,j=n-1;


        while(i<j){
            int sum = arr[i]+arr[j];
            if(sum<=limit){
                i++;
                j--;
                count++;
            }
            else if(sum>limit){
                count++;
                j--;
            }
            
        }
        if(i==j) count++;
  return count;
    }
}