class Solution {
    public int minRotations(String s) {

        int n = s.length();

        int current = 0;
        int minimum = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            int next = s.charAt(i)-'0';
            
            int diff = Math.abs(current-next);

            minimum = Math.min(diff,10-diff);

            ans += minimum;

            current = next;

        }
        return ans;
    }
}