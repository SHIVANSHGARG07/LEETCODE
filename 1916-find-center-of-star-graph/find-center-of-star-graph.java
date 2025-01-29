class Solution {
    public int findCenter(int[][] edges) {
        int n = edges.length+1;
        int[] in = new int[n+1];

        for(int[] edge:edges){
            in[edge[0]]++;
            in[edge[1]]++;
        }

        for(int i=1;i<=n;i++){
     if(in[i]==n-1){
        return i;
     }
        }
        return -1;
    }
}