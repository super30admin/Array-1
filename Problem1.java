// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
We divide the array into left half and right half
Left half contains product of elements left to current element
Right half contains product of elements right to current element
Result will be product of left and right array
For optimising the space complexity we maintain a single array where we first store the left array elements
and right array elements are placed in a variable and computed in the same array for final product
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        //left check
        for(int i=1; i<n; i++) {
            res[i] = res[i-1] * nums[i-1];
        }
        int right = 1; //right product
        for(int i = n-1; i>=0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        return res;
    }
}
