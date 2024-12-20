class Solution {
    public boolean checkStraightLine(int[][] arr) {
        if (arr.length == 2)
            return true;

        int x1 = arr[0][0], y1 = arr[0][1];
        int x2 = arr[1][0], y2 = arr[1][1];

        for (int i = 2; i < arr.length; i++) {
            int x3 = arr[i][0];
            int y3 = arr[i][1];
            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                return false; 
            }
        }
        return true;
    }
}