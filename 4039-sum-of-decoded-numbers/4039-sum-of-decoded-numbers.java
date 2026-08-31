class Solution {

    public long find(long num, long width) {

        String s = String.valueOf(num);

        // first width digits
        return Long.parseLong(s.substring(0, (int) width));
    }

    public int sumDecoded(long[] nums) {

        int n = nums.length;

        long[] width = new long[n];
        long[] d = new long[n];
        long[] x = new long[n];
        long[] y = new long[n];

        long ans = 0;
        long MOD = 1000000007;

        for (int i = 0; i < n; i++) {

            // last digit = width
            width[i] = nums[i] % 10;

            // remove width
            d[i] = nums[i] / 10;

            // first width digits = x
            x[i] = find(d[i], width[i]);

            // remaining digits = y
            String s = String.valueOf(d[i]);

            y[i] = Long.parseLong(
                s.substring((int) width[i])
            );

            // x^y
            ans = (ans + power(x[i], y[i], MOD)) % MOD;
        }

        return (int) ans;
    }

    public long power(long x, long y, long MOD) {

        long result = 1;

        while (y > 0) {

            if (y % 2 == 1) {
                result = (result * x) % MOD;
            }

            x = (x * x) % MOD;
            y = y / 2;
        }

        return result;
    }
}