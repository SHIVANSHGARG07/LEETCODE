class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Lists to store rows and columns to be zeroed
        List<Integer> zeroRows = new ArrayList<>();
        List<Integer> zeroCols = new ArrayList<>();
        
        // Step 1: Identify rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    if (!zeroRows.contains(i)) {
                        zeroRows.add(i);  // Add the row index to zeroRows list
                    }
                    if (!zeroCols.contains(j)) {
                        zeroCols.add(j);  // Add the column index to zeroCols list
                    }
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
