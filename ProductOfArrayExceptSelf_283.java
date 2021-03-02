public class ProductOfArrayExceptSelf_283 {
    
    //TC: O(2n) - Since we are running two for loops. If we ignore the constant, it will be O(n)
    //SC: O(1) - Not creating any auxilary spaces depends on the input.
    
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[] {};
        
        int[] result = new int[nums.length];
        result[0] = 1;
        int sum = 1;
        //Traverse from left to right - calculate the cumulative sum of left elements.
        //Travers from right to left - calculate the cumulative sum of right elements.
        for(int i=1;i<nums.length;i++) {
            sum = sum * nums[i-1];
            result[i] = sum;
        }
        
        sum = 1;
        for(int j=nums.length-2;j>=0;j--) {
            sum = sum * nums[j+1];
            result[j] = sum * result[j];
        }
        
        return result;
    }
    
    public static void main(String[] args) {

        ProductOfArrayExceptSelf_283 productOfArrayExceptSelf_283 = new ProductOfArrayExceptSelf_283();
        int[] result = productOfArrayExceptSelf_283.productExceptSelf(new int[] { 1,2,3,4});
        System.out.println(result);

    }
}
