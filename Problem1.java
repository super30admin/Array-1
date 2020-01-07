// Time Complexity : O(n)
// Space Complexity : O(1) since auxillary space of the output array is not considered.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* In left pass, find the product of all elements to the left of the current element. In the right pass, find the product of all elements
to the right of the current element.
Multiply elements at both these indexes to get the current value
 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0)
            return result;

        int runningProduct = 1;
        int temp = 1; //to store element at an index

        //left pass
        for(int i=0;i<nums.length;i++){
            result[i] = runningProduct * temp;
            runningProduct = runningProduct * temp;
            temp = nums[i];
        }


        runningProduct = 1;
        temp = 1;

        for(int i=nums.length-1;i >= 0;i--){
            result[i] = result[i] * runningProduct * temp;
            runningProduct = runningProduct * temp;
            temp = nums[i];

        }
        return result;
    }
}