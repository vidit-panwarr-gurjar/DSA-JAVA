
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        int low = 1;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long total = 0;

            for (int i = 0; i < piles.length; i++) {
                total += (piles[i] + (long) mid - 1) / mid;
            }

            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
