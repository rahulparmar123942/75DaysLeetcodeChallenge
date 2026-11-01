class Solution {
    public int findPairs(int[] nums, int k) {
        
       if (k < 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                duplicate.add(num);
            }

            set.add(num);
        }

        if (k == 0) {
            return duplicate.size();
        }

        int count = 0;

        for (int num : set) {
            if (set.contains(num + k)) {
                count++;
            }
        }

        return count;
    }
}