/*
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums is None or len(nums) == 0:
            return []
        
        result = [0]*len(nums)
        product = 1
        
        for i in range(len(nums)):
            result[i] = product
            product *= nums[i]
            
        product = 1
        for i in reversed(range(len(nums))):
            result[i] *= product
            product *= nums[i]
        
        return result
*/
// Time Complexity : O(n) where n is size of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I maintained a left product and right product and at the end 
// multiplied them together

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0){
            return new int[0];
        }
        
        int product = 1;
        int [] result = new int[nums.length];
        
        for (int i=0; i<nums.length; i++){
            result[i] = product;
            product = product * nums[i];
        }
        
        product = 1;
        for (int i=nums.length - 1; i>-1; i--){
            result[i] = result[i] * product;
            product = product * nums[i];
        }
        
        return result;
    }
}
