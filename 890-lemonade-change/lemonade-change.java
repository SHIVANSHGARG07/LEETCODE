import java.util.HashMap;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer, Integer> cash = new HashMap<>();
        cash.put(5, 0); // Frequency of $5 bills
        cash.put(10, 0); // Frequency of $10 bills
        
        for (int bill : bills) {
            if (bill == 5) {
                // Collect $5 bill
                cash.put(5, cash.get(5) + 1);
            } else if (bill == 10) {
                // Collect $10 bill and give back $5
                if (cash.get(5) > 0) {
                    cash.put(5, cash.get(5) - 1);
                    cash.put(10, cash.get(10) + 1);
                } else {
                    return false; // Can't give change
                }
            } else if (bill == 20) {
                // Collect $20 bill and give back $15
                if (cash.get(10) > 0 && cash.get(5) > 0) {
                    // Use one $10 and one $5
                    cash.put(10, cash.get(10) - 1);
                    cash.put(5, cash.get(5) - 1);
                } else if (cash.get(5) >= 3) {
                    // Use three $5 bills
                    cash.put(5, cash.get(5) - 3);
                } else {
                    return false; // Can't give change
                }
            }
        }
        return true;
    }
}
