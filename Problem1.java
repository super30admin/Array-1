// Time Complexity : O(N)
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach: By mutiplying left elements and right elements

class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Base cases
        if(nums == null || nums.length == 0) return new int[0];
        int temp = 1;
        int product = 1;
        int[] result = new int[nums.length];
        
        //left product calculatin
        for(int i = 0; i < nums.length; i++){
            product = product * temp;
            result[i] = product;
            temp = nums[i];
        }
        
        product = 1 ; temp =1;
        for(int i = nums.length -1; i >= 0; i--){
            product = product * temp;
            result[i] = result[i] * product;
            temp = nums[i];
        }
        return result;
    }
}
