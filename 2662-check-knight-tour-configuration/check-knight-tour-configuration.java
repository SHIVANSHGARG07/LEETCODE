class Solution {
   int[] dirx = {1,2,-1,-2,1,2,-1,-2};
    int[] diry = {2,1,2,1,-2,-1,-2,-1};

    private boolean check(int i,int j,int n,int move,int[][] grid,boolean[][] vis){
        if(i<0 || j<0 || i>=n || j>=n || grid[i][j]!=move || vis[i][j]) return false;

        if(move==n*n-1) return true;
        vis[i][j]=true;

        for(int k=0;k<8;k++){
            int nr = i+dirx[k];
            int nc = j+diry[k];

            if(check(nr,nc,n,move+1,grid,vis)){
                return true;
            }
        }
                vis[i][j]=false;

        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        boolean[][] vis = new boolean[n][n];
        return check(0,0,n,0,grid,vis);
    }
}