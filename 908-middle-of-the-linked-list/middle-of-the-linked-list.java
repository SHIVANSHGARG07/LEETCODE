class Solution {
    private int length(ListNode head){
        int len=0;
        while(head!=null){
            head = head.next;
            len++;
        }
        return len;
    }
    public ListNode middleNode(ListNode head) {
        int mid = length(head)/2;
        ListNode temp = head;
        int count=0;
        while(count<mid){
            temp = temp.next;
            count++;
        }
        return temp;
    }
}