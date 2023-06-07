// Time Complexity : O(n)[O(2n) as we are traversing once through the leftArray and nums]
// Space Complexity : O(1) [Though we are using leftarray according to prob statement the output array does not count as extra space for space complexity analysis]
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*1. We use leftarray which keeps product of all elmenets towards left.
2. after computing the left array reset the running product to 1 and iterate the left array from right at index length -1 and multiple the running product with nums[i+1];
 * 
 */


class Solution {
    public int[] productExceptSelf(int[] nums) {
        //base case
        if(nums.length == 0 || nums == null) return new int[]{};
        int n = nums.length;
        int[] leftArray = new int[n];
        int runningProduct = 1;
        //product of element towards its left is 1
        leftArray[0] = 1;
        for(int i=1; i < n ;i++){
            //compute product of all elements towards it left
            runningProduct = runningProduct * nums[i-1];
            //store running in left array
         leftArray[i] = runningProduct;
           
        }
        //reset running product to 1
           runningProduct = 1;
           //start from the last but 1 index
            for(int i= n-2; i>=0;i--){
                runningProduct = runningProduct * nums[i+1];
                leftArray[i] = runningProduct *  leftArray[i];

            }
        return leftArray;
    }
}