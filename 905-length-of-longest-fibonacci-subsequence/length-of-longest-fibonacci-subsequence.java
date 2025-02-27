import java.util.*;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        
        // Store all elements in the HashSet for quick lookup
        for (int num : arr) {
            set.add(num);
        }

        int maxLength = 0;

        // Try all pairs (arr[i], arr[j]) as the first two numbers
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i], b = arr[j];
                int length = 2; // At least two numbers are in the sequence
                
                // Continue forming Fibonacci-like sequence
                while (set.contains(a + b)) {
                    int c = a + b;
                    a = b;
                    b = c;
                    length++;
                }
                
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength >= 3 ? maxLength : 0; // Return 0 if no valid sequence found
    }
}
