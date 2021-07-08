//Time Complexity: O(N)
//Space complexity: O(1), because we are returning same array which is used to store left product. So, its not considered as auxiliary space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Calculating the left product and right product of that index and storing their product in result array. Redcuing the space complexity by O(1) by using a variable to calculate the right product.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        //New array to keep track of left product & using same array to store the result
        int[] result = new int[nums.length];
        
        //calculating the left product
        result[0] = 1;
        for(int i=1; i<nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        
        //using a variable, calucating the right product of each index
        int right = 1;
        
        //calculating final answer
        for(int i=nums.length-1; i >= 0; i--){
            result[i] = right * result[i];
            right = right * nums[i];
        }
        
        return result;
    }
}
