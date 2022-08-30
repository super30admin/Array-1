// Time Complexity : O(n) where n is the number of elements in the input
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
/* https://leetcode.com/problems/product-of-array-except-self/ */

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        //null check
        if(nums == null || nums.length == 0)
            return result;

        int running_product = 1;
        result [0] = 1;

        //left pass
        for(int i=1 ; i< n ; i++){
            running_product = running_product * nums[i-1];
            result[i] = running_product;
        }

        //right pass
        running_product = 1;
        for(int i= n-2 ; i >=0 ; i--){
            running_product = running_product*nums[i+1];
            result[i] *= running_product;
        }
        return result;
    }
}