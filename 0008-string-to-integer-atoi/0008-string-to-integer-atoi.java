class Solution {
    public int myAtoi(String s) {
         s = s.trim();
        if (s.isEmpty()) return 0;

        int i = 0, sign = 1, n = s.length();
        int num = 0;

        // Handle sign
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        // Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Check overflow BEFORE adding digit
            if (num > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num * 10 + digit;
            i++;
        }

        return num * sign;
    }

}