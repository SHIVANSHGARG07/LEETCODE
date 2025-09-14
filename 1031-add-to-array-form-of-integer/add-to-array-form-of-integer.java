class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int i = num.length - 1;
        int carry = 0;
        
        while (i >= 0 || k > 0 || carry > 0) {
            int x = (i >= 0) ? num[i] : 0;
            int y = k % 10;
            int sum = x + y + carry;
            
            list.addFirst(sum % 10);  // no need to reverse later
            carry = sum / 10;
            k /= 10;
            i--;
        }
        return list;
    }
}
