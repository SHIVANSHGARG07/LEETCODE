class Solution {
     public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        int n = intervals.length;

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

       for(int i=1;i<n;i++){
        int[] last = merged.get(merged.size()-1);

        if(last[1] > intervals[i][0]){
            last[1] = Math.max(last[1],intervals[i][1]);
        }
        else{
            merged.add(intervals[i]);
        }
       }
       return merged.toArray(new int[merged.size()][]);
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
       List<int[]> hor = new ArrayList<>();
        List<int[]> vert = new ArrayList<>();

        for (int[] coord : rectangles) {
            int x1 = coord[0];
            int y1 = coord[1];
            int x2 = coord[2];
            int y2 = coord[3];

            hor.add(new int[]{x1, x2});
            vert.add(new int[]{y1, y2});
        }

        int[][] horArray = hor.toArray(new int[hor.size()][]);
        int[][] vertArray = vert.toArray(new int[vert.size()][]);

        int[][] result1 = merge(horArray);
        if (result1.length >= 3) {
            return true;
        }

        int[][] result2 = merge(vertArray);
        return result2.length >= 3;
     
    }
}