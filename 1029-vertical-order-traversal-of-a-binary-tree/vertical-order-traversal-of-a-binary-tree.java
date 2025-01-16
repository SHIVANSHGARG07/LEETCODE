class Solution {
    public void func(TreeNode root,TreeMap<Integer,TreeMap<Integer,List<Integer>>>mp,int row,int col){
        if(root==null) return ;
      if(!mp.containsKey(col)){
        mp.put(col,new TreeMap<>());
      }
      if(!mp.get(col).containsKey(row)){
        mp.get(col).put(row,new ArrayList<>());
      }
      mp.get(col).get(row).add(root.val);
      func(root.left,mp,row+1,col-1);
      func(root.right,mp,row+1,col+1);
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer,TreeMap<Integer, List<Integer>>> mp = new TreeMap<>();
        func(root, mp, 0, 0);

        for(int num:mp.keySet()){
         TreeMap<Integer, List<Integer>> row = mp.get(num);
         List<Integer>adding = new ArrayList<>();

            for(int r:row.keySet()){
                List<Integer>add = row.get(r);
                Collections.sort(row.get(r));
                adding.addAll(row.get(r));
            }
            ans.add(adding);
        }
        return ans;

    }
}