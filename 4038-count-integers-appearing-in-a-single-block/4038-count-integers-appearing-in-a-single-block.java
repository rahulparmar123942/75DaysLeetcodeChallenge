class Solution {
    public int countSpecialIntegers(int[] nums) {
    
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (!first.containsKey(nums[i])) {
                first.put(nums[i], i);
            }

            last.put(nums[i], i);
        }

        int count = 0;

        for (int num:map.keySet()) {

            int frequency = map.get(num);
            int firstPos = first.get(num);
            int lastPos = last.get(num);

            if (frequency == lastPos - firstPos + 1) {
                count++;
            }
        }

        return count;
    
    }
}