Time Complexity: O(n)
Space Complexity: Constant
Ran successfully on leetcode?: yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] outputArray = new int[nums.length];
        int rMul = 1;
        outputArray[0] = 1;
        
        for(int i = 1; i < nums.length; i++){
            rMul *= nums[i - 1];
            outputArray[i] = rMul;
        }
        
        rMul = 1;
        
        for(int i = nums.length - 2; i >= 0; i--){
            
            rMul *= nums[i + 1];
            outputArray[i] *= rMul;
            
        }
        
        return outputArray;
    }
}
