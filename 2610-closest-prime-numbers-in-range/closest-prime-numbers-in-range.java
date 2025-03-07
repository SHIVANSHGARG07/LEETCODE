class Solution {
    public int[] closestPrimes(int left, int right) {
        
        boolean [] prime = new boolean[right+1];

        Arrays.fill(prime,true);

        prime[0]=false;
        prime[1]=false;

        for(int i=2;i*i<=right;i++){
            if(prime[i]){
                for(int j=i*i;j<=right;j+=i){
                    prime[j]=false;
                }
            }
        }
     
     List<Integer>primes = new ArrayList<>();
     for(int i=left;i<=right;i++){
        if(prime[i]){
            primes.add(i);
        }
     } 


     if(primes.size()<2) return new int[]{-1,-1};

     int miny = Integer.MAX_VALUE;
     int[] res = new int[2];

     for(int i=1;i<primes.size();i++){

        int num1= primes.get(i-1);
        int num2 = primes.get(i);

        int min = num2-num1;

        if(min<miny){
            miny = min;
            res[0]=num1;
            res[1]=num2;
        }

     }
     return res;
    }
}