
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n];
        Arrays.fill(dp, -1);

        return Math.min(solve(0, cost, dp), solve(1, cost, dp));
    }

    public int solve(int i, int[] cost, int[] dp) {
        if (i>=cost.length) return 0;

        if (dp[i]!=-1) return dp[i];

        int oneStep=cost[i]+solve(i+1,cost,dp);
        int twoStep=cost[i]+solve(i+2,cost,dp);

        return dp[i]=Math.min(oneStep,twoStep);
    }
}
