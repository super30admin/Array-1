// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// The idea is to maintain the product of left and right side at each stage to exclude the current
// number at this index. For the left pass, we write the product to the result and for the right pass,
// the value obtained is multiplied with the value in result to save space.

// Your code here along with comments explaining your approach
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;  
        int result[] =new int[n];  // declare the result array with size of nums
        int rp =1;
        result[0] = 1; // the first number does  not have a left product

        // left pass
        for(int i=1;i<n;i++){
            rp *= nums[i-1];  // compute the left half of the product until the current index
            result[i] = rp; // write the left product to the result
        }

        // right pass
        rp = 1;
        for(int i = n-2;i>=0;i--){
            rp*= nums[i+1]; // compute the right half of the product until the current index
            result[i] = rp*result[i]; // multiply the right product value with the existing result
        }

        return result;
    }
}