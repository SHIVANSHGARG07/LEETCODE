class Solution {
    public int minimumLength(String s) {
        int n = s.length();
        if(n==1) return 1;
        int len =n;
        int i=0,j=n-1;

        while(i<j){
            if(s.charAt(i)==s.charAt(j) && i<j){
                len-=2;
                if(s.charAt(i)==s.charAt(i+1) && i+1<j){
                    while(s.charAt(i)==s.charAt(i+1) && i+1<j){
                        i++;
                        len--;
                    }
                }
                if(s.charAt(j)==s.charAt(j-1) && j-1>i){
                    while(s.charAt(j)==s.charAt(j-1) && j-1>i){
                        j--;
                        len--;
                    }
                }
            }
            else{
                break;
            }
            i++;
            j--;
        }
        return len;
        
    }
}