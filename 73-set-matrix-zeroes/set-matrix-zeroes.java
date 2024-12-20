import java.util.HashSet;

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // HashSets to store rows and columns to be zeroed
        HashSet<Integer> zeroRows = new HashSet<>();
        HashSet<Integer> zeroCols = new HashSet<>();
        
        // Step 1: Identify rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows.add(i);  // Add the row index to zeroRows set
                    zeroCols.add(j);  // Add the column index to zeroCols set
                }
            }
        }
        
        // Step 2: Set rows and columns to zero based on the identified indices
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zeroRows.contains(i) || zeroCols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
