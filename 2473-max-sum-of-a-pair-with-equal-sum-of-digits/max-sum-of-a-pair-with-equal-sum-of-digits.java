class Solution {
    private int func(int num){
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        TreeMap<Integer,List<Integer>>mp = new TreeMap<>();

        for(int num:nums){
            int val = func(num);
            mp.putIfAbsent(val,new ArrayList<>());
            mp.get(val).add(num);
        }
        int maxy =0;
        
        for(List<Integer> list:mp.values()){
            if(list.size()>1){
            Collections.sort(list,Collections.reverseOrder());
            maxy = Math.max(maxy,list.get(0)+list.get(1));
            }
        }
        return maxy>0?maxy:-1;

    }
}