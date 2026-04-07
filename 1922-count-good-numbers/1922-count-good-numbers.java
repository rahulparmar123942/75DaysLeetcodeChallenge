class Solution {

    static final long MOD = 1000000007;

    // Fast Power (Binary Exponentiation)
    private long power(long x, long y) {
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

    public int countGoodNumbers(long n) {
        long evenCount = (n + 1) / 2;
        long oddCount = n / 2;

        long evenWays = power(5, evenCount);
        long oddWays = power(4, oddCount);

        return (int)((evenWays * oddWays) % MOD);
    }
}