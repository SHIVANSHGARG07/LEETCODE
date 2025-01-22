class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] arr = new int[m][n];
        Queue<int[]>q = new LinkedList<>();


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j]==1){
                    arr[i][j]=0;
                    q.add(new int[]{i,j});
                }
                else{
                    arr[i][j]=-1;
                }
            }
        }

        // 0 pe bfs and vis
        int[][]directions = {{-1,0},{0,1},{0,-1},{1,0}};

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int x = cell[0];
            int y = cell[1];

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < m && newY >= 0 && newY < n && arr[newX][newY] == -1) {
                    arr[newX][newY] = arr[x][y] + 1;
                    q.offer(new int[]{newX, newY});
                }
            }
        }
return arr;


    }
}
// 0 0 1 
// 1 0 0 
// 0 0 0 
