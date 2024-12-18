import java.util.*;

class Solution {
    public int fillCups(int[] amount) {
        int count = 0;
        // Use a priority queue (max-heap) to always process the largest amounts first
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add the amounts into the max-heap
        for (int i = 0; i < amount.length; i++) {
            if (amount[i] > 0) {
                pq.add(amount[i]);
            }
        }

        // Process the queue until it is empty
        while (!pq.isEmpty()) {
            // Pop the two largest elements (largest two types of water)
            int first = pq.poll();
            int second = pq.isEmpty() ? 0 : pq.poll();

            // Decrement the values (fill one cup of each type)
            first--;
            second--;

            // If there's still water to be filled, push back into the heap
            if (first > 0) pq.add(first);
            if (second > 0) pq.add(second);

            // Increment the number of seconds
            count++;
        }

        return count;
    }
}
