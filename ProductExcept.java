// Time Complexity : O(n) where n is the number of elements 
// Space Complexity : O(n) for the output array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : This is difficult to come up with a pattern
/* Your code here along with comments explaining your approach: Store the running product from left to right and use temp variable to store the 
nums[i] value, then multiple rp * temp to store the next product in output array. Now do the running product in the single array itself from right
to left by multiplying the running product with temp and store it in output array itself. The temp takes the next index nums[i].
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int temp = 1, rp =1;
        for(int i = 0 ; i <nums.length;i++){
            rp*=temp;
            output[i] = rp;                             // Left to right store running product 
            temp = nums[i];
        }
        rp = 1; temp = 1;
        for(int i = output.length-1; i >=0; i--){
             rp*= temp;
            output[i] *= rp;                            // Right to left, output[i] * running product
            temp = nums[i];                             //temp takes the next nums[i] value
        }
        return output;
    }
}