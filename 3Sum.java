import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList <>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length-1;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(left < right){
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }
                else if(nums[i]+nums[left]+nums[right]>0){
                    right--;
                }
                else{
                    List<Integer> row = new ArrayList <>();
                    row.add(nums[i]);
                    row.add(nums[left]);
                    row.add(nums[right]);

                    list.add(row);
                    left++;
                    right--;
                
                while(left < right && nums[left]== nums[left-1]){
                    left++;
                }
                while(left < right && nums[left] == nums[right-1]){
                    right--;
                }
                }
            }
        }
    return list;       
    }
}