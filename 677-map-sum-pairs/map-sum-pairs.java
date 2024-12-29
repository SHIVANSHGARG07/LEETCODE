class MapSum {
    private HashMap<String, Integer> mp;

    public MapSum() {
        this.mp = new HashMap<>();
    }

    public void insert(String key, int val) {
        mp.put(key, val);
    }

    public int sum(String prefix) {
        int sum = 0;
        for (String name : mp.keySet()) {
            if (name.indexOf(prefix) == 0) {
                sum += mp.get(name);
            }
        }
     return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */