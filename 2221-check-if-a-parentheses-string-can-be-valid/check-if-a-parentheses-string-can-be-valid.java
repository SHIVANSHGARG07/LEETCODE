class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();


        if(n%2!=0) {return false;}
        Stack<Integer>a = new Stack<>();
        Stack<Integer>b = new Stack<>();

        for(int i=0;i<n;i++){
            if(locked.charAt(i)=='0'){
                b.add(i);
            }
            else if(s.charAt(i)=='('){
            a.add(i);
            }
            else if(s.charAt(i)==')'){
             if(!a.isEmpty()){
                a.pop();
             }
             else if(!b.isEmpty()){
                b.pop();
             }else{
                return false;
            }
        }
        }
        while(!a.isEmpty() && !b.isEmpty() && a.peek()<b.peek()){
            a.pop();
            b.pop();
        }
        return a.isEmpty();
    }
}