class RandomizedSet {
  private HashSet<Integer>st;
    public RandomizedSet() {
        st= new HashSet<>();
    }
    
    public boolean insert(int val) {
        if(!st.contains(val)){
            st.add(val);
            return true;
        }
        else{
        return false;
        }
        
    }
    
    public boolean remove(int val) {
      if(st.contains(val)){
            st.remove(val);
            return true;
        }
        else{
        return false;
        }  
    }
    
    public int getRandom() {
        List<Integer>list = new ArrayList<>(st);
        Random random = new Random();

        return list.get(random.nextInt(list.size()));

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */