class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        HashMap<Integer,int[]>mp = new HashMap<>();
        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mp.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int idx=0;idx<arr.length;idx++){
            int num =  arr[idx];
        int[] curr = mp.get(num);

        row[curr[0]]++;
        col[curr[1]]++;

        if(row[curr[0]]==n || col[curr[1]]==m) return idx;
        
        }
        return -1;


    }
}