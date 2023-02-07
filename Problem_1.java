// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* We take left and right products of all elements in array. After taking left product array, we use just a variable to keep 
   track of right product and keep on mutiplying both values to receive product except self at each index. In the end we return
   the left array which reduces our space complexity to O(1).
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0)
            return new int[] {};

        int n = nums.length;
        int[] leftPro = new int[n];
        
        int rp = 1;

        for(int i = 0; i < n; ++i) {
            leftPro[i] = rp;
            rp = rp * nums[i];
        }

        rp = 1;

        for(int i = n - 1; i >= 0; --i) {
            leftPro[i] *= rp;
            rp = rp * nums[i];
        }

        return leftPro;
    }
}