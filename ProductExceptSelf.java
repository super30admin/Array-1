//TC: O(n)
//SC: O(1)
//Program ran on leetcode successfully. 
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
 
        int tempL = 1;
        int productsArray[] = new int[nums.length];
 
        for (int i = 0; i < nums.length; i++){
            productsArray[i] = 1;
        }
 
        for (int i = 0; i < nums.length; i++) {
            productsArray[i] = tempL;
            tempL *= nums[i];
        }
 
        int tempR = 1;
 
        for (int i = nums.length - 1; i >= 0; i--) {
            productsArray[i] *= tempR;
            tempR *= nums[i];
        }
 
        return productsArray;
        
    }
}