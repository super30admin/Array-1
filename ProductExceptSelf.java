/**
 * # Idea: 
 * [ 1, 2, 3, 4]
 * [ 1 * (2*3*4) , 1 * (3 * 4) , (1* 2) * (4) , (1*2*3) * 4]
 * 1. Traverse the array calculate forward pass product. 
 * 2. Traverse the array from end multiply the product with backward pass. 
 * 3. return result 
 * 
 * # Time Complexity : O(n) - number of elements
 * # Space Complexity : O(n) - result array
 */

class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        
        int p =1;
        int[] product_before = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            product_before[i] = p;
            p = p * nums[i];
        }

        p=1;
        
        for(int i=nums.length-1;i>=0;i--){
            product_before[i] = product_before[i] * p;
            p = p * nums[i];
        }

        for(int i=0;i<product_before.length;i++)
            System.out.println(product_before[i]);
        
        return product_before;
    }
    public static void main(String[] args){
        System.out.println("Product Except Self");
        ProductExceptSelf obj = new ProductExceptSelf();
        int[] nums = {1,2,3,4};
        obj.productExceptSelf(nums);
    }
}