import java.util.*;

class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {
            if (!stack.isEmpty() && num < stack.peek()) {
                // Collapse the current chunk
                int maxInChunk = stack.pop();
                while (!stack.isEmpty() && stack.peek() > num) {
                    stack.pop();
                }
                stack.push(maxInChunk); // Push back the maximum of the collapsed chunk
            } else {
                stack.push(num);
            }
        }
        
        return stack.size(); // Number of chunks is the stack size
    }
}
