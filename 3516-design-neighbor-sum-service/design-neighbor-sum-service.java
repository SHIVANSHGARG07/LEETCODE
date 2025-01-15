class NeighborSum {
    private int[][] grid;
    private HashMap<Integer,int[]>mp;
    private int m,n;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
        this.mp = new HashMap<>();
        this.m = grid.length;
        this.n = grid[0].length;

        for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            mp.put(grid[i][j],new int[]{i,j});
        }
    }
    }
    
    public int adjacentSum(int value) {
        if(!mp.containsKey(value)) return 0;

        int[] idx = mp.get(value);
        int row = idx[0];
        int col = idx[1];
        int sum=0;
        if(row-1>=0) sum+=grid[row-1][col];
        if(col-1>=0) sum+=grid[row][col-1];
        if(col+1<=n-1) sum+=grid[row][col+1];
        if(row+1<=m-1) sum+=grid[row+1][col];
        return sum;
    }
    
    public int diagonalSum(int value) {
        if(!mp.containsKey(value)) return 0;
        int sum =0;
       int[] idx = mp.get(value);
        int row = idx[0];
        int col = idx[1];

        if(row-1>=0 && col-1>=0) sum+=grid[row-1][col-1];
        if(row-1>=0 && col+1<n) sum+=grid[row-1][col+1];
        if(row+1<m && col+1<n) sum+=grid[row+1][col+1];
        if(row+1<m && col-1>=0) sum+=grid[row+1][col-1];

        return sum;

        
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */