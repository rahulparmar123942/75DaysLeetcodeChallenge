import java.util.*;

class Solution {

    public long maxBalancedSubsequenceSum(int[] nums) {

        TreeMap<Long, Long> map = new TreeMap<>();

        long answer = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            long key = (long) nums[i] - i;

            // Best previous sum where previous key <= current key
            Map.Entry<Long, Long> entry = map.floorEntry(key);

            // Start a new subsequence with nums[i]
            long sum = nums[i];

            // Or extend a previous subsequence
            if (entry != null) {
                sum = Math.max(sum, nums[i] + entry.getValue());
            }

            // Store maximum sum for this key
            long oldValue = map.getOrDefault(key, Long.MIN_VALUE);

            if (sum > oldValue) {
                map.put(key, sum);
            }

            // Remove dominated entries
            entry = map.higherEntry(key);

            while (entry != null && entry.getValue() <= sum) {

                long removeKey = entry.getKey();

                map.remove(removeKey);

                entry = map.higherEntry(removeKey);
            }

            answer = Math.max(answer, sum);
        }

        return answer;
    }
}