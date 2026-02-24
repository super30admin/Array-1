//We solve this using Prefix Product + Suffix Product without division.
//
//Steps:
//
//First pass (left → right):
//Store product of all elements to the left
//
//Second pass (right → left):
//Multiply product of all elements to the right
//
//This gives product except self.
//
//        Time: O(n)
//Space: O(1) (excluding result array)

class Solution {

    public int[] productExceptSelf(int[] nums) {

        // Length of input array
        int n = nums.length;

        // Result array to store final answer
        int[] result = new int[n];

        // Running product variable (used for prefix and suffix)
        int rp = 1;

        // First element has no left elements
        // So prefix product = 1
        result[0] = 1;

        // LEFT PASS
        // Store product of all elements to the LEFT of current index
        for(int i = 1; i < n; i++) {

            // Multiply previous running product with previous element
            rp = rp * nums[i - 1];

            // Store prefix product
            result[i] = rp;
        }


        // Reset running product for RIGHT PASS
        rp = 1;


        // RIGHT PASS
        // Multiply result with product of elements to the RIGHT
        for(int i = n - 2; i >= 0; i--) {

            // Multiply running product with next element
            rp = rp * nums[i + 1];

            // Multiply prefix product (already stored)
            // with suffix product
            result[i] = result[i] * rp;
        }


        // Final result array
        return result;
    }
}