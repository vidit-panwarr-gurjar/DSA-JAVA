class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length){
            return -1;
        }
        int max = 0;
        int sum = 0;
        for(int num: nums){
            sum = sum + num;
            if(max < num){
                max = num;
            }
        }
        int low = max;
        int high = sum;
        while(low <= high){
            int mid = low + (high-low) /2;

            int pages = 0;
            int student = 1;
            for(int i = 0;i<nums.length;i++){
                if(pages + nums[i] <= mid){
                    pages = pages + nums[i];
                }
                else{
                    pages = nums[i];
                    student++;
                }
            }
            if(student <= k){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
    return low;
    }
}