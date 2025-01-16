class Solution {
    private int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    public void dfs(char[][] board,boolean[][] vis,int i,int j){
        int m = board.length;
        int n = board[0].length;

       vis[i][j]=true;

       for(int[] dir:directions){
        int nr = dir[0]+i;
        int nc = dir[1]+j;
        if(nr>=0 && nr<m && nc>=0 && nc<n && !vis[nr][nc] && board[i][j]=='O'){
            dfs(board,vis,nr,nc);
        }
       }
    }
    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        boolean[][] vis = new boolean[m][n];

        for(int i=0;i<m;i++){
            if(vis[i][0]==false && board[i][0]=='O') dfs(board,vis,i,0);
            if(vis[i][n-1]==false && board[i][n-1]=='O') dfs(board,vis,i,n-1);
        }

        for(int j=0;j<n;j++){
            if(vis[0][j]==false && board[0][j]=='O') dfs(board,vis,0,j);
            if(vis[m-1][j]==false && board[m-1][j]=='O') dfs(board,vis,m-1,j);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
        


        
    }
}