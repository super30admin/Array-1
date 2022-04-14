class ProductOfArrayExceptItself {

    // Time Complexity : 0(n) where n is the length of the array
// Space Complexity : 0 (1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english: I took the product of left part of the array and stored it in product.
    //Once the left part was traversed, I reinitialized runningproduct to 1 to take the product of right side of the array.
    //Then multiplied the initial product with the new product to get the resultant.

// Your code here along with comments explaining your approach

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] product = new int[length];
        int runningproduct = 1;
        product[0] = 1;
        for(int i = 1; i < length; i++){
            runningproduct = nums[i-1] * runningproduct;
            product[i] = runningproduct;
        }
        runningproduct = 1;
        for(int i = length-2; i >= 0; i--){
            runningproduct = runningproduct * nums[i + 1];
            product[i] =  runningproduct * product[i];
        }
        return product;
    }
}