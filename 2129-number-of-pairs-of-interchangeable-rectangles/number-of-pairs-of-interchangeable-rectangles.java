class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Double,Long>mp = new HashMap<>();

int n = rectangles.length;
        for(int i=0;i<n;i++){
            double val = (double) rectangles[i][0]/rectangles[i][1];

                mp.put(val,mp.getOrDefault(val,0L)+1);

        }

    long count =0;
    for(double num:mp.keySet()){
            long val = mp.get(num);
            if(val>=2){
            count = count+(val*(val-1))/2;
        }
    }
    return count;

    }
}