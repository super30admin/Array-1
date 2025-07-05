/*238. Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.
Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
 */

/*
Time Complexity:-O(n)
Space Complexity:-O(1)
Approach:-We can't use division, so we build the answer in two steps:
First pass: Store the product of all elements to the left of each index.
Second pass (reverse): Multiply with the product of all elements to the right.
This gives the product of all elements except the current one, in O(n) time and O(1) extra space (output array not counted).
*/
class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // Base case: return empty array if input is null or empty
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        int n = nums.length;// Get the length of the input array
        int[] answer = new int[n];// Initialize the output array
        int rP = 1; // rP = running product (used for left pass)
        answer[0] = rP; // First element has no elements to its left
        // First pass: fill left product for each index
        for (int i = 1; i < n; i++) {
            rP = rP * nums[i - 1]; // Multiply running product by the previous element
            answer[i] = rP; // Store the left product at index i
        }
        rP = 1;// Reset running product for right pass
        // Second pass: multiply with right product for each index
        for (int i = n - 2; i >= 0; i--) {
            rP = rP * nums[i + 1]; // Multiply running product by the next element
            answer[i] = answer[i] * rP; // Multiply current value with right product
        }
        return answer; // Return the final result array
    }
}