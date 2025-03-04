class Solution {
    private boolean func(int n,int num){
        if(n==0) return true;
        if(num>n) return false;

        // try multiply 
        if(func(n-num,num*3)){
            return true;
        }
        
        // else skip
        return func(n,num*3);

    }
    public boolean checkPowersOfThree(int n) {
        return func(n,1);

    }
}