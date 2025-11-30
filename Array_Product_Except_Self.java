// Time Complexity : O(N) -> To traverse N elements of input array
// Space Complexity : O(1) -> Since the ouput array that we created is used to store left product of each input element and then update each left product in output array with right product * left product and finally return as output. So, no extra space used
// Did this code successfully run on Leetcode : Yes
// We created an output array to store the left product of each element in the input array. Then we traverse the input array from the end to calculate the right product and update the output array by multiplying the right product with the left product already stored in the output array.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Base condition - If array is null, no product
        if(nums == null || nums.length == 0){
            return new int[0];
        }

        // Create a new output array 
        // In that output array, we will store left product of each element first
        // Then, calculate right product of each element and update output array with left*right product
        int[] output = new int[nums.length];
        // Initialize a product to 1 - left product of 1st element in input array will be 1
        int product = 1;

        /////LEFT PRODUCT//////
        // Calculate left product of each element in input array and store in output array
        for(int i=0; i < nums.length; i++){
            output[i] = product; // For element at index i, store the left product in output array
            // calculate and update left product for next element
            product = product * nums[i];
        }

        /////RIGHT PRODUCT//////
        // Calculate right product of each element and update output array with left*right product. start at last element of input array to calculate right product
        // Reset product = 1 as right product of last element in input array will be 1
        product = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            // We have the right product for element i - We multiply right product with left product in output array at index i and update output array 
            //output[i] = left product * right product;
            output[i] = output[i] * product;
            // calculate and update right product for previous element
            product = product * nums[i];
        }
        return output;     
    }
}
