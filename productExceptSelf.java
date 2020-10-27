// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 238

class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length];
        int temp=1;
        int product = 1;
        
        
        //Left product
        for(int i = 0 ; i < nums.length; i++){
            product = temp*product;
            result[i] = product;
            temp = nums[i];
        }
        
        //Right product
        temp=1;
        product = 1;
        for(int i = nums.length-1 ; i >=0; i--){
            product = temp*product;
            result[i] = product*result[i];
            temp = nums[i];
        }
        
        return result;
    }
}