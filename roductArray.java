//O(1) SPACE, o(n) time
//passed all leetcode cases
//solved the approach discussed in class.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        //edge
        if(nums==null || nums.length == 0) return result;
        int rp =1;
        int temp = 1;
        //left pass
        for(int i=0;i<nums.length;i++){
            rp = rp*temp;
            result[i] = rp;
            temp = nums[i];
        }
        rp =1;
        temp =1;
        for(int i = nums.length-1;i>=0;i--){
            rp=rp*temp;
            result[i]= rp*result[i];
            temp = nums[i];
        }
        return result;
    }
}