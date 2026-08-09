class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        int[][] dp = new int[n][n];

        // Base case: first row
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill the DP table from top to bottom
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {

                int up = dp[i - 1][j];

                int leftDiagonal = Integer.MAX_VALUE;
                if (j - 1 >= 0) {
                    leftDiagonal = dp[i - 1][j - 1];
                }

                int rightDiagonal = Integer.MAX_VALUE;
                if (j + 1 < n) {
                    rightDiagonal = dp[i - 1][j + 1];
                }

                dp[i][j] = matrix[i][j]
                        + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Answer can end at any column in the last row
        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[n - 1][j]);
        }

        return ans;
    }
}