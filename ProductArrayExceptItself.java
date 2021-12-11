// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// For finding product at any ith index, calculate the right product on the fly using a variable
// calculate the left product in an array
// Use leftArray and rightProduct to obtain the result

// Your code here along with comments explaining your approach
public class ProductArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int [] left = new int[n]; // this will keep left array product first, eventually will use this as resultant array

        int rp =1;  // variable to keep the right elements product

        left[0] = 1;
        // Find the left elements product
        for(int i =1; i<n;i++) {
            left[i] = left[i-1] * nums[i-1];
        }

        // Store product of right and left in ith element
        // Update the right product
        for(int i = n-1; i>=0; i--) {
            left[i] = rp*left[i];
            rp = rp*nums[i];
        }

        // contains our result
        return left;
    }
}
