class Solution {
    public int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i  rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        int required = (rows  cols)  2;

        while (low  high) {
            int mid = low + (high - low)  2;
            int count = 0;

            for (int i = 0; i  rows; i++) {
                int left = 0;
                int right = cols - 1;

                while (left = right) {
                    int m = left + (right - left)  2;

                    if (matrix[i][m] = mid) {
                        left = m + 1;
                    } else {
                        right = m - 1;
                    }
                }

                count += left;
            }

            if (count = required) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
}