import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int occupiedDays = 0, prevEnd = 0;
        
        for (int[] arr : meetings) {
            int start = arr[0];
            int end = arr[1];

            if (start > prevEnd + 1) { 
                occupiedDays += (start - prevEnd - 1); 
            }

            prevEnd = Math.max(prevEnd, end);
        }

        occupiedDays += (days - prevEnd);

        return occupiedDays;
    }
}
