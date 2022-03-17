class ProductOfArrayExceptItself {
  /**
   * https://leetcode.com/problems/product-of-array-except-self/
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1) (just space occupied by the result array)
   * 
   * Were you able to solve this on Leetcode? Yes
   * Any issues solving this? No
   */

  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    
    result[0] = 1;
    for(int i = 1; i < nums.length; i++){
        result[i] = result[i-1] * nums[i-1];
    }
    
    int rightProd = 1;
    for(int j = nums.length-1; j>=0; j--) {
        result[j] = result[j] * rightProd ; // left * right
        rightProd *= nums[j];
    }
    
    return result;
  }
}
