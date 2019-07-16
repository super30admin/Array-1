class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        
        int p =1;
        int[] product_before = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product_before[i] = p;
            p = p * nums[i];
        }

        p=1;
        int[] product_after = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            product_after[i] = p;
            p = p * nums[i];
        }

        int[] result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = product_before[i] * product_after[i];
        }
        
        return result;
    }
    public static void main(String[] args){
        System.out.println("Product Except Self");
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        obj.productExceptSelf(nums);
    }
}