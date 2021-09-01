// Time Complexity : O(n) where n is length of given array
// Space Complexity : O(1) because no use of extra data structure to process the output
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        //null check
        if( nums.length == 0 || nums == null ) return new int[0];
        
        int n = nums.length; 
        int[] result = new int[n]; //declaring result array with same length
        
        int product = 1; //intitalizing the product variable to 1
        result[0] = product; //first position 1
        
        for( int i = 1; i < n; i++ ) { //first loop to calculate left products
            product = product * nums[i-1] ; //each position will store product of its left elements
            result[i] = product;
        }
        
        product = 1; //making it again 1 for next loop
        
        for( int i = n-2; i >= 0; i-- ) { //second loop in reverse for right products
            product = product * nums[i+1];
            result[i] = result[i] * product;//left elements product is multiplied with right product
        }
        
        return result; //returning final product array
        
    }
}