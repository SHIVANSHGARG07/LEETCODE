class Solution {
    public int dfs(int[][] grid,int i,int j){
        int m = grid.length;
        int n = grid[0].length;

        if(i>=m || i<0 || j>=n || j<0 || grid[i][j]==0) return 0;

        int ans =0;
        ans+=grid[i][j];
        grid[i][j]=0;
        

        ans+= dfs(grid,i+1,j);
        ans+=dfs(grid,i-1,j);
        ans+=dfs(grid,i,j+1);
        ans+=dfs(grid,i,j-1);

        return ans;

    }
    public int findMaxFish(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int maxy = 0;
        

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]>0){
                    int sol = dfs(grid,i,j);
                    maxy = Math.max(maxy,sol);
                }
            }
        }
        return maxy;
    }
}