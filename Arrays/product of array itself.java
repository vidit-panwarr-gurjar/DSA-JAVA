class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int a = 1;
        for(int i = 0; i  nums.length; i++){
            a = anums[i];
            prefix[i] = a;
        }
        a = 1;
        for(int i = nums.length-1; i= 0;i--){
            a= a nums[i];
            postfix[i] = a;
        }
        int[] answer = new int[nums.length];
        for(int i = 1; inums.length -1;i++){
            answer[i] = prefix[i-1]  postfix[i+1];
        }
        answer[0] = postfix[1];
        answer[nums.length-1] = prefix[nums.length-2];
    return answer;
    }
}