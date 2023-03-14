// Time complexity: O(n)
// Space complexity: O(1)

class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int currProduct = 1;
        int n = nums.length;
        int [] output = new int[n];
        output[n-1] = 1;
        for(int i = n-2; i >= 0; i--){
            currProduct = nums[i+1] * currProduct;
            output[i] = currProduct;
        }
        currProduct = 1;
        for(int i = 1; i <= n-1; i++){
            currProduct = currProduct * nums[i-1];
            output[i] = output[i] * currProduct;
        }
        return output;
    }
}
