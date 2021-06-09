class Solution {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] productExceptSelf(int[] nums) {

        // The length of the input array 
        int length = nums.length;

        // Final res array to be returned
        int[] res = new int[length];

        // res[i] contains the product of all the elements to the left
        // Note: for the element at index '0', there are no elements to the left,
        // so the res[0] would be 1
        res[0] = 1;
        for (int i = 1; i < length; i++) {

            // res[i - 1] already contains the product of elements to the left of 'i - 1'
            // Simply multiplying it with nums[i - 1] would give the product of all 
            // elements to the left of index 'i'
            res[i] = nums[i - 1] * res[i - 1];
        }
        int R = 1;
        for (int i = length - 1; i >= 0; i--) {

            // For the index 'i', R would contain the 
            // product of all elements to the right. We update R accordingly
            res[i] = res[i] * R;
            R *= nums[i];
        }

        return res;
    }
}