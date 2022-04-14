// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/product-of-array-except-self/


public int[] ProductExceptSelf(int[] nums) {
        
    if(nums == null || nums.Length == 0)
        return new int[]{};
    
    int[] result = new int[nums.Length];
    result[0] = 1;
    int runningProduct = 1;
    
    //calculate left array using running product
    for(int i = 1; i < nums.Length; i++)
    {
        runningProduct *= nums[i-1];
        result[i] = runningProduct;
    }
    
    runningProduct = 1;
    //go to right to left and update the value of result using running product
    for(int i = nums.Length - 2; i >= 0; i--)
    {
        runningProduct *= nums[i+1];
        result[i] *= runningProduct;
    }
    
    return result;
}