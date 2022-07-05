// Time Complexity : O(n)
// Space Complexity : O(1) since the result array itself is expected as the output.
// Did this code successfully run on Leetcode : yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }

        int n = nums.length;
        int[] result = new int[n]; // the left array.
        int rp = 1; // running product for the right part.

        result[0] = 1; // the product of all elements left of the first elememnt is 1 always.

        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }

        rp = 1; // resetting rp to 1 for computing the right running sum.

        for (int i = n - 2; i >= 0; i--) { // iterating from second last element because the product right to the last
                                           // element is 1.
            rp = rp * nums[i + 1];
            result[i] = rp * result[i]; // multiplying the current rp value with the calculated left array(result)
                                        // value.
        }

        return result;

    }
}