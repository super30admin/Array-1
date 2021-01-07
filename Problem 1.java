//Time Complexity: O(N) where N is the length of the array
//Space Complexity: O(1)


class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        
        int lp = 1;
        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for(int i = 1; i < leftProduct.length; i++)
        {
            lp = lp * nums[i-1];
            leftProduct[i] = lp;
        }
        
        lp = 1;
        for(int i = nums.length-2; i >= 0; i--)
        {
            lp = lp * nums[i+1];
            leftProduct[i] = lp * leftProduct[i];
        }
        
        return leftProduct;
    }
}