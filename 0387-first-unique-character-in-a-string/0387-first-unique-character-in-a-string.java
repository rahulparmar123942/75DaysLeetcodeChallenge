class Solution {
    public int firstUniqChar(String s) {
         HashMap<Character, int[]> map = new HashMap<>();

        // 1. Frequency count + index store
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, new int[]{1, i});
            } else {
                map.get(ch)[0]++;
            }
        }

        // 2. String ko original order mein traverse karo
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.get(ch)[0] == 1) {
                return i;
            }
        }

        return -1;
    }
}