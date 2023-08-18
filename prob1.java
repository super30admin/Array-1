// Time Complexity : O(n)
// Space Complexity : O(n)
// Compute the left products of each element and store them in the leftProducts array.
// Compute the right products of each element and store them in the rightProducts array.
// Multiply the corresponding left and right products for each element to get the final output array.

public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] leftProducts = new int[n];
    int[] rightProducts = new int[n];
    int[] output = new int[n];
    
    leftProducts[0] = 1;
    for (int i = 1; i < n; i++) {
        leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
    }
    
    rightProducts[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) {
        rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
    }
    
    for (int i = 0; i < n; i++) {
        output[i] = leftProducts[i] * rightProducts[i];
    }
    
    return output;
}

