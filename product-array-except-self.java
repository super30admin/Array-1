// Time Complexity : O(3n) -> O(n)
// Space Complexity : O(2n) -> O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
/* Create two array leftProduct and rightProduct
Store the multiplied value af all the elements to the left side of the element in the leftProduct and on the right side on the rightProduct
Multiply both values and return nums */
// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        leftProduct[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i-1]*nums[i-1];
        }
        
        rightProduct[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
             rightProduct[i] = rightProduct[i+1]*nums[i+1];
        }
        for(int i = 0; i < n; i++){
            nums[i] = leftProduct[i]*rightProduct[i]; 
        }

        return nums;
    }
}