class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
        if(valid(derived,n,0)){
            return true;
        }
        else{
            return valid(derived,n,1);
        }
    }
    private boolean valid(int[] derived,int n,int first){
        int[] original = new int[n];
        original[0]=first;

        for(int i=0;i<n-1;i++){
            original[i+1]=original[i]^derived[i];
        }

        return (original[n-1] ^ original[0])==derived[n-1];
    }
}