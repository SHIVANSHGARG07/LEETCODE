class Solution {
    public int func(String a,String b){
        int zero =0,one=0;
        for(char c:a.toCharArray()){
            if(c=='0'){
                zero++;
            }
        }
        for(char c:b.toCharArray()){
            if(c=='1'){
                one++;
            }
        }
        return zero+one;
    }
    public int maxScore(String s) {
        int maxy = Integer.MIN_VALUE;
        int n = s.length();

        for(int i=0;i<n-1;i++){
         maxy = Math.max(maxy,func(s.substring(0,i+1),s.substring(i+1)));
        }
        return maxy;
    }
}