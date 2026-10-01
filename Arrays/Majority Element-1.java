class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int check = 0;
        for(int i = 0;i<nums.length;i++){
            if(count == 0){
                check = nums[i];
                count++;   
            }
            else if(check == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
    return check;  
    }
}