class NumberContainers {
  HashMap<Integer,TreeSet<Integer>>mp;
  HashMap<Integer,Integer>mp2 ;
    public NumberContainers() {
      mp =  new HashMap<>(); 
      mp2 = new HashMap<>(); 
    }
    
    public void change(int index, int number) {
        if(mp2.containsKey(index)){
            int toRemove = mp2.get(index);
            if(mp.containsKey(toRemove)){
                mp.get(toRemove).remove(index);
            }
        }
        mp2.put(index,number);
        mp.putIfAbsent(number,new TreeSet<>());
        mp.get(number).add(index);

    }
    
    public int find(int number) {
        if(!mp.containsKey(number) || mp.get(number).isEmpty()){
            return -1;
        }
  TreeSet<Integer>st = mp.get(number);        
        int num  = st.first();

        return num;

    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */