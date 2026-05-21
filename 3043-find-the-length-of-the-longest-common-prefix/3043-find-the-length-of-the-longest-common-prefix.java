class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2){
          HashSet<String> set = new HashSet<>();

        // Store all prefixes of arr1 numbers
        for (int num : arr1) {

            String s = String.valueOf(num);

            String prefix = "";

            for (int i = 0; i < s.length(); i++) {
                prefix += s.charAt(i);
                set.add(prefix);
            }
        }

        int maxLen = 0;

        // Check prefixes of arr2 numbers
        for (int num : arr2) {

            String s = String.valueOf(num);

            String prefix = "";

            for (int i = 0; i < s.length(); i++) {

                prefix += s.charAt(i);

                if (set.contains(prefix)) {
                    maxLen = Math.max(maxLen, prefix.length());
                }
            }
        }

        return maxLen;
    }
}