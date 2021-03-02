// TC - O(n)
// SC - O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Create a result arr with nums size, return result if nums is null or length is 0
        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0){
            return result;
        }
        // Initializing 0th index of result is 1 and rp as 1
        result[0] = 1;
        int rp = 1;
        // left pass
        // Iterate from 1 to n, keep a note of product of values left to current element
        for(int i=1; i<nums.length; i++){ 
            rp *= nums[i-1];
            result[i] = rp;
        }
        
        //right pass
        rp = 1;
        // Iterate from n-1 to 0, keep a note of product of values right to current element and multiply it with current element in array
        for(int i = nums.length-2; i>=0; i--){
            rp *= nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}