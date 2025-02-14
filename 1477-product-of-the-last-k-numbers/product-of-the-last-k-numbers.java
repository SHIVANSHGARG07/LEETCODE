class ProductOfNumbers {
   private ArrayList<Integer>list;

    public ProductOfNumbers() {
        list = new ArrayList<>();
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        int size = list.size();
        int pro=1;
        if(size>=k){
            for(int i=size-k;i<size;i++){
                pro*=list.get(i);
            }
        }
        return pro;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */