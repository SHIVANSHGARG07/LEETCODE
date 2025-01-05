class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i=0,j=n-1;
        long maxy = Long.MIN_VALUE;
        while(i<j){
            int width = j-i;
            int heights = Math.min(height[i],height[j]);
            long area = width*heights;
            maxy = Math.max(maxy,area);

            if(height[j]>height[i]){
                i++;
            }
            else{
                j--;
            }
        }
        return (int)maxy;

    }
}