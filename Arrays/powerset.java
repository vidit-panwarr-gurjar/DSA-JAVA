class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList <>();
        List<Integer> list1 = new ArrayList <>();
        Helper(0,list,list1,nums);
        return list;

    }
    public void Helper(int i,List<List<Integer>> list,List<Integer> list1,int[] nums){
        if(i == nums.length){
            list.add(new ArrayList <>(list1));
            return;
        }
        if(i < nums.length){
            list1.add(nums[i]);
            Helper(i+1,list,list1,nums);
            list1.remove(list1.size()-1);
        }
        if(i < nums.length){
            Helper(i+1,list,list1,nums);
        }
    }
}