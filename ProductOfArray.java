// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

//Using multiplication and extra array, we calculate the product of subarray until the specific index and store in left and right array traversing in both directions
//Then combine the two intermediate arrays into result array by multiplying values at each indexes

// Your code here along with comments explaining your approach

public class ProductOfArray {
    
    public int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        
        int[] res = new int[nums.length];
        
        left[0] = 1;
        for(int i = 1 ; i < nums.length; i++) {
            left[i] = nums[i-1] * left[i-1];
        }
        
        right[nums.length - 1] = 1;
        for(int j = nums.length - 2 ; j >= 0; j--) {
            right[j] = nums[j+1] * right[j+1];

        }
        
        
        for(int k = 0 ; k < nums.length; k++) {
            res[k] = left[k] * right[k];
        }
        
        
        return res;
    }

}
