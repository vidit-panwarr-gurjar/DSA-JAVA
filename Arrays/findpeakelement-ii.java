class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int low = 0;
        int high = mat[0].length-1;

        while(low <= high){
            int mid = (low + high)/2;
            int row = 0;
            for(int i = 1; i < mat.length;i++){
                if(mat[i][mid] > mat[row][mid]){
                    row = i;
                }
            }
            int left = (mid > 0) ? mat[row][mid-1] : -1;
            int right = (mid < mat[0].length-1) ? mat[row][mid + 1]: -1;

            if(mat[row][mid] > left && mat[row][mid] > right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid] < left){
                high = mid - 1;
            }
            else{low = mid + 1;}
        }
    return new int[]{-1,-1};
    }
}