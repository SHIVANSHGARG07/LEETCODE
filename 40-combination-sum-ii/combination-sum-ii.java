class Solution {
    HashSet<List<Integer>> st = new HashSet<>();

    public void func(int[] arr, int target, int idx, List<Integer> line) {
        int n = arr.length;
        if (target == 0) {
            st.add(new ArrayList<>(line));
            return;
        }
        if (idx >= n)
            return;

        for (int i = idx; i < n; i++) {
            if (arr[i] > target)
                break; // because sorted

                if(i>idx && arr[i]==arr[i-1]) continue;

            // jaise hm call krni hai ek baar 1,7 ban skta hai in 1st test case
            line.add(arr[i]);
            func(arr, target - arr[i], i + 1, line);
            line.remove(line.size() - 1);

        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> line = new ArrayList<>();
        Arrays.sort(candidates);

        func(candidates, target, 0, line);
        for (List<Integer> arr : st) {
            ans.add(arr);
        }
        return ans;
    }
}
