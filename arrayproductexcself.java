// TC: O(n)
// SC: O(n)
// Runs on leetcode
// No problem faced

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[nums.length];
        }
        int leftans[] = new int[nums.length];
        int rightans[] = new int[nums.length];
        
        leftans[0] = 1;
        rightans[nums.length - 1] = 1;
        
        for(int i = 1; i < nums.length; i++) {
            leftans[i] = nums[i - 1] * leftans[i - 1];
        }
        
        for (int i = nums.length - 2; i >= 0; i--) {
            rightans[i] = nums[i + 1] * rightans[i + 1];
        }
        
        int result[] = new int[nums.length]; 
            
        for(int i = 0; i < nums.length; i++) {
            result[i] = leftans[i] * rightans[i];
        }
        return result;
    }
}
