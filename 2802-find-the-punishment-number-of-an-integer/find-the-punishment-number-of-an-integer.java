class Solution {
    private static boolean canPartition(String squareStr, int target, int index, int currentSum) {
        if (index == squareStr.length()) {
            return currentSum == target;
        }
        
        int num = 0;
        for (int i = index; i < squareStr.length(); i++) {
            num = num * 10 + (squareStr.charAt(i) - '0'); // Forming numbers from substrings
            
            // If current sum + formed number is within target, proceed
            if (currentSum + num <= target) {
                if (canPartition(squareStr, target, i + 1, currentSum + num)) {
                    return true;
                }
            } else {
                break; 
            }
        }
        
        return false;
    }
    public int punishmentNumber(int n) {
        int totalSum = 0;
        
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            String squareStr = String.valueOf(square);
            
            // Use backtracking to check if squareStr can be partitioned
            if (canPartition(squareStr, i, 0, 0)) {
                totalSum += square;
            }
        }
        
        return totalSum;
    }
}