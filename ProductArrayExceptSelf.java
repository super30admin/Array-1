/**
 * TC: O(n) SC: O(n)
 * Approach: Maintain product till curr index in left array by using running product, now for right array change the values in the previous array itself. 
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return new int[0];
        int[] res = new int[nums.length];
       
        int rp = 1;
        for(int i = 0; i < nums.length; i++){
            res[i] = rp;
            rp *= nums[i];
        }   
        rp = 1;
        for(int i = nums.length-1; i >= 0; i--){
            res[i] *= rp;
            rp *= nums[i];
        }
        return res;
    }
}