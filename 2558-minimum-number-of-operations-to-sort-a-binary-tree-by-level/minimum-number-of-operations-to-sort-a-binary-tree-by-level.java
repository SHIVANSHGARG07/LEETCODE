class Solution {
    public int countSwaps(List<Integer>list){
       HashMap<Integer,Integer>mp = new HashMap<>();
       for(int i=0;i<list.size();i++){
        mp.put(list.get(i),i);
       }
       List<Integer>sorted = new ArrayList<>(list);
       Collections.sort(sorted);
       int count=0;
       for(int i=0;i<list.size();i++){
        if(list.get(i)!=sorted.get(i)){
            count++;
            int existing = mp.get(sorted.get(i));
            mp.put(list.get(i),existing);
            mp.put(sorted.get(i),i);
            Collections.swap(list,i,existing);
        }
       }
       return count;

    }
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int count=0;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer>ans = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                ans.add(curr.val);

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
                    count+=countSwaps(ans);
        }
        return count;

        
    }
}

