class Solution {
    public int NthRoot(int N, int M) {
        int low = 0;
        int high = M;

        while(low <= high){
            int mid = (low + high)/2;
            double power = Math.pow(mid,N);

            if(power == M){
                return mid;
            }
            else if(power > M){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
    return -1;
        
    }
}