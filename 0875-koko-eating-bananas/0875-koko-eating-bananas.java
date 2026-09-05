import java.util.*;

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int low = 1;
        int result = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (isValid(piles, h, mid)) {

                result = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return result;
    }

    private boolean isValid(int[] piles, int h, int speed) {

        long hours = 0;

        for (int pile : piles) {

            hours += (pile + speed - 1) / speed;

            if (hours > h) {
                return false;
            }
        }

        return true;
    }
}