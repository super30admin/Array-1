//Time and Space: o(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
    
    int[] leftProducts = new int[n];
    int[] rightProducts = new int[n];
    int[] result = new int[n];
    
    int leftProduct = 1;
    for (int i = 0; i < n; i++) {
        leftProducts[i] = leftProduct;
        leftProduct *= nums[i];
    }
    
    int rightProduct = 1;
    for (int i = n - 1; i >= 0; i--) {
        rightProducts[i] = rightProduct;
        rightProduct *= nums[i];
    }
    
    for (int i = 0; i < n; i++) {
        result[i] = leftProducts[i] * rightProducts[i];
    }
    
    return result;
    }
}
