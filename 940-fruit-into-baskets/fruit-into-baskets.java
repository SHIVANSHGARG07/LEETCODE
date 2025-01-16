class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        int l=0,r=0;
        int n = fruits.length;
        int maxy = Integer.MIN_VALUE;
        while(r<n){
            mp.put(fruits[r],mp.getOrDefault(fruits[r],0)+1);

            while(mp.size()>2){
                int num = fruits[l];
                mp.put(num,mp.getOrDefault(num,0)-1);
                if(mp.get(num)==0){
                    mp.remove(num);
                }
                l++;
            }

            maxy = Math.max(maxy,r-l+1);
            r++;
        }
        return maxy;
    }
}