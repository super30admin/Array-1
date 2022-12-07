// Product of Array Except Self

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : For every element in the array, we have to find the products of all the elements except itself, in other words, we have to find the product of all the elements towards its left and right. For this, we create 2 arrays. First array will contain the product of all the elements towards its left and the second array will contain the product of all the elements towards the right of the element in consideration from the parent array. Now that we have left and the right products, all that we have to do is to multiply matching indices from both the arrays. To reduce the space complexity, instead of creating a second new array, we can just multiply the running product with the first array itself and output it.

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        if(nums == null || nums.length == 0) // Check if the array itself is not initialized or if there are no elements in the array
            return result;
        int rProd = 1; 
        result[0] = rProd; // Running left product of the first element will be 1 as there is no element to the left of the element at the 0th index
        for(int i = 1; i <nums.length; i++){ // Iterate through the array, calculate the running product and update the result array
            rProd *= nums[i-1];
            result[i] = rProd;
        }
        rProd = 1; // Running right product of the last element will be 1 as there is no element to the right of the element at the last index
        for(int i = nums.length - 2; i >= 0; i--){ // Iterate through the array from backwards starting from the second last element, as the running product to multiply the last element with will be 1, calculate the running product and update the array
            rProd *= nums[i+1];
            result[i] *= rProd; // Update the same array (output array) itself to save space
        }
        return result;
    }
}