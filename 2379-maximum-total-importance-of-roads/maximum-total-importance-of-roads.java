class Solution {
    public long maximumImportance(int n, int[][] roads) {
       int[] in = new int[n];

       for(int[] edge:roads){
        in[edge[0]]++;
        in[edge[1]]++;
       } 
       long sum=0;
       long rank =1;

       Arrays.sort(in);
       for(int i=0;i<n;i++){
        sum += rank*in[i];
        rank++;
       }
return sum;
    }
}