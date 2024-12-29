class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        
        int[][] arr = new int[n][n];
        for(int[] query:queries){
         int sr = query[0];
         int sc = query[1];
         int er = query[2];
         int ec = query[3];
         for(int i=sr;i<=er;i++){
            for(int j=sc;j<=ec;j++){
                arr[i][j]++;
            }
         }
        }
        return arr;
    }
}