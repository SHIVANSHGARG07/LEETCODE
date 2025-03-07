class Solution {
        private int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int backtrack(int[][] grid,int i,int j,boolean[][] vis){
        int m = grid.length;
        int n = grid[0].length;

        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0 || vis[i][j]) return 0;

        int ans =0;
        vis[i][j]=true;

        for(int[] dir:directions){
            int newX = dir[0]+i;
            int newY = dir[1]+j;
            ans  = Math.max(ans,backtrack(grid,newX,newY,vis));
        }

        vis[i][j]=false;
        return ans+grid[i][j];



    }
    public int getMaximumGold(int[][] grid) {
        int maxy = 0;
        int m = grid.length;
        int n = grid[0].length;
   boolean [][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              maxy  = Math.max(maxy,backtrack(grid,i,j,vis));
            }
        }
        return maxy;
    }
}