class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
       long[] in = new long[n]; 

       for(int i=0;i<n;i++){
        in[edges[i]]+=i;
       }

       int ans=0;
       long maxy=0;
       

       for(int i=0;i<n;i++){
        if(in[i]>maxy){
            ans =i;
            maxy=in[i];
        }
       }
       return ans;
    }
}