// Time Complexity :O(n) where n is the length of the given array
// Space Complexity : O(1) since the returned array is not considered as extra space.
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
 * Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 * Input:  [1,2,3,4]
 * Output: [24,12,8,6]
 *
 * Each cell in the array -- cal the product of its left half and right half and multiply these and store it in the cell.
 * So, in one pass---i cal the left half of the product for each cell and in another pass , cac. the right half...thus giving the product except self.
 */

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        //left half of the product
        res[0] = 1;
        for(int i = 1;i<nums.length;i++)
            res[i] = res[i-1] * nums[i-1];

        //right half of the product
        int rightptr = 1;
        for(int i = nums.length-1;i>=0;i--)
        {
            res[i] = res[i] * rightptr;
            rightptr *= nums[i];
        }
        return res;
    }
}

