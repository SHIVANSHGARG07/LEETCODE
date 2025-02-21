class FindElements {
    private HashSet<Integer>st;
    public FindElements(TreeNode root) {
        st = new HashSet<>();
        func(root,0);
    }
    private void func(TreeNode root,int val){
        if(root==null) return;
        root.val = val;
        st.add(val);

        func(root.left,2*val+1);
        func(root.right,2*val+2);
    }
    
    public boolean find(int target) {
        return st.contains(target);
    }
}
