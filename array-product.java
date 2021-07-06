//TC: O(N)
//SC: O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        //left
        result[0] = 1;
        for(int i=1; i<nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        //right
        int right = 1;
        for(int i = nums.length-1; i>=0; i--) {
            result[i] = result[i] * right;
            right = right * nums[i];
        }
        
        return result;
    }
}