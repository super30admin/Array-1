class ProductExceptSelf {

    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int[] left_prod = new int[nums.length];
        int[] right_prod = new int[nums.length];
        
        left_prod[0] = 1;
        for(int i = 1; i < nums.length; i++){
            left_prod[i] = nums[i-1] * left_prod[i-1];
        }
        
        right_prod[nums.length-1] = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            right_prod[i] = nums[i+1] * right_prod[i+1];
        }
        
        for(int i = 0; i < nums.length; i++)
            result[i] = left_prod[i] * right_prod[i];
        
        return result;
    }
}