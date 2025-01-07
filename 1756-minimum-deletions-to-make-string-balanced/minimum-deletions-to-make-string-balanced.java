class Solution {
    public int minimumDeletions(String s) {
        Stack<Character>st = new Stack<>();
        int n = s.length();
        int count=0;
        for(int i=n-1;i>=0;i--){
         if(s.charAt(i)=='b'){
            if(!st.isEmpty() && st.peek()=='a'){
                st.pop();
                count++;
            }
         }
         else{
            st.add(s.charAt(i));
         }
        }
        return count;
    }
}