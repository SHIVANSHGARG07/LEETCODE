class Solution {
    private int[][] directions = {{-1,1},{1,-1},{0,-1},{-1,0},{1,1},{0,1},{1,0},{-1,-1}};

    private int func(int[][] board,int i,int j){
        int m = board.length;
        int n = board[0].length;
        int count=0;

        for(int[] dir:directions){
         int nr=i+dir[0];
         int nc=j+dir[1];

         if(nr>=0 && nr<m && nc>=0 && nc<n){
            if(board[nr][nc]==1 || board[nr][nc]==2){
                count++;
            }
         }
        }
        return count;

        
    }
    public void gameOfLife(int[][] board) {

        // mark if live as 2 means it helps to keep track it is curr 1 and will be going to 0 after iteerations over
        // -1 it means 0 and going to be 1 no need to keep track 

         int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
             int live = func(board,i,j);

             if(board[i][j]==1){
                if(live<2 || live>3){
                board[i][j]=2;
                }
             }
             else{
                // for 0 
                if(live==3){
                board[i][j]=-1;
                }
             }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==2){
                    board[i][j]=0;
                }
                else if(board[i][j]==-1){
                    board[i][j]=1;
                }
            }
        }

        
    }
}