class Solution {

    Boolean[] dp;

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;

        for (int x : nums) {
            sum += x;
        }

        if (sum % k != 0) return false;

        int target = sum / k;

        int n = nums.length;

        // dp[mask] = whether this set of used elements can lead to a solution
        dp = new Boolean[1 << n];

        return solve(nums, k, target, 0, 0);
    }

    public boolean solve(int[] nums, int k, int target,
                         int mask, int currentSum) {

        // k-1 subsets successfully created
        if (k == 1) {
            return true;
        }

        // Current subset completed
        if (currentSum == target) {
            return solve(nums, k - 1, target, mask, 0);
        }

        if (dp[mask] != null) {
            return dp[mask];
        }

        for (int i = 0; i < nums.length; i++) {

            // already used
            if ((mask & (1 << i)) != 0) {
                continue;
            }

            // don't exceed target
            if (currentSum + nums[i] > target) {
                continue;
            }

            // take
            if (solve(nums, k, target,
                      mask | (1 << i),
                      currentSum + nums[i])) {

                return dp[mask] = true;
            }
        }

        return dp[mask] = false;
    }
}