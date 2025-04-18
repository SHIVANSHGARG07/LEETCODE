// class Solution {
//     public int memo(int[] days,int[]costs,int idx,int[] dp){
//      int n = days.length;
//      if(idx>=n){
//         return 0;
//      }
//      if(dp[idx]!=-1) return dp[idx];

//      int one = costs[0]+memo(days,costs,idx+1,dp);

//      int idx2 = idx;
//         while (idx2 < n && days[idx2] < days[idx] + 7) {
//             idx2++;
//         }
//         int two = costs[1] + memo(days, costs, idx2, dp);

//      int idx3 = idx;
//         while (idx3 < n && days[idx3] < days[idx] + 30) {
//             idx3++;
//         }
//         int three = costs[2] + memo(days, costs, idx3, dp);

//     return dp[idx]=Math.min(one,Math.min(two,three));

//     }
//     public int mincostTickets(int[] days, int[] costs) {
//         int n = days.length;
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return memo(days,costs,0,dp);
//     }
// }

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int[] dp = new int[n + 1]; // dp[i] = min cost to cover days[i...n-1]
        dp[n] = 0; // Base case: No cost for no days

        for (int idx = n - 1; idx >= 0; idx--) {
            // Option 1: 1-day pass
            int one = costs[0] + dp[idx + 1];

            // Option 2: 7-day pass
            int idx2 = idx;
            while (idx2 < n && days[idx2] < days[idx] + 7) {
                idx2++;
            }
            int two = costs[1] + dp[idx2];

            // Option 3: 30-day pass
            int idx3 = idx;
            while (idx3 < n && days[idx3] < days[idx] + 30) {
                idx3++;
            }
            int three = costs[2] + dp[idx3];

            // Store the minimum cost
            dp[idx] = Math.min(one, Math.min(two, three));
        }

        return dp[0]; // Minimum cost to cover all days
    }
}
