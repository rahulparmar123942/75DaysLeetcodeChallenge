class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int x : piles){
            high = Math.max(high, x);
        }

        int ans = high;

        while(low <= high){
            int mid = low + (high - low) / 2;

            long hours = 0;

            for(int pile : piles){
                hours += (pile + mid - 1) / mid; // ceil
            }

            if(hours <= h){
                ans = mid;
                high = mid - 1; // try smaller
            } else {
                low = mid + 1; // need more speed
            }
        }

        return ans;
    }
}