class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length-1;
        int carry =0,sum=0;
        List<Integer> list = new ArrayList<>();
        int x=0,y=0;
        while(k>0 || len>=0 || carry>0){
            x = (len>=0) ? num[len] : 0;
            y = k%10;
            sum = x+y+carry;
            list.add(sum%10);
            carry = sum/10;
            k = k/10;
            len--;
        }
        Collections.reverse(list);
        return list;
    }
}