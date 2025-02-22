class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer>st = new Stack<>();
        st.push(-1);
        int maxLength=0;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
            st.push(i);
        }
        else{
            // 3 cases 
            // if -1 on top then it calculates length 1 and popes -1 then goes to else condition for 
            // recent invalid 
            // if ( on top tehn it cal length
            // if closing pop and add neew index
             
            st.pop();
            if(!st.isEmpty()){
                // cal length
                maxLength = Math.max(maxLength,i-st.peek());
            }
            else{
                // if empty means this is invalid 
                // so push this for recent invalid pair 
                st.push(i);
            }
        }
    }
    return maxLength;
    }
}
