import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] vec = nums.clone();
        Arrays.sort(vec);

        int groupNum = 0;
        Map<Integer, Integer> numToGroup = new HashMap<>();
        Map<Integer, List<Integer>> groupToList = new HashMap<>();

        numToGroup.put(vec[0], groupNum);
        groupToList.putIfAbsent(groupNum, new ArrayList<>());
        groupToList.get(groupNum).add(vec[0]);

        for (int i = 1; i < n; i++) {
            if (Math.abs(vec[i] - vec[i - 1]) > limit) {
                groupNum++;
            }
            numToGroup.put(vec[i], groupNum);
            groupToList.putIfAbsent(groupNum, new ArrayList<>());
            groupToList.get(groupNum).add(vec[i]);
        }

        // Sort each group explicitly
        for (List<Integer> list : groupToList.values()) {
            Collections.sort(list);
        }

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int group = numToGroup.get(num);
            result[i] = groupToList.get(group).remove(0); // Remove smallest element
        }

        return result;
    }
}
