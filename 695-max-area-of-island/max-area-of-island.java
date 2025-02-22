class Solution {
    private int dfs(int[][] grid,int i,int j){
         int m = grid.length;
        int n = grid[0].length;
        int count=0;

        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]==0) return 0;

        count++;

        grid[i][j]=0;

       count+= dfs(grid,i,j+1);
       count+= dfs(grid,i,j-1);
        count+=dfs(grid,i-1,j);
       count+= dfs(grid,i+1,j);

        return count;

    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxy = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(grid[i][j]==1){
                maxy = Math.max(maxy,dfs(grid,i,j));
               }
            }
        }
        return maxy;
        
    }
}