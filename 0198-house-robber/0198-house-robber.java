class Solution {

    public int rec(int[] nums, int i, int[] dp) {

        if (i>=nums.length) return 0;

        if (dp[i]!=-1) return dp[i];

        int skip_current=rec(nums, i + 1, dp);
        int rob_current=nums[i] + rec(nums, i+2, dp);

        return dp[i]=Math.max(rob_current, skip_current);
    }

    public int rob(int[] nums) {

        int[] dp=new int[nums.length];
        Arrays.fill(dp, -1);

        return rec(nums, 0, dp);
    }
}