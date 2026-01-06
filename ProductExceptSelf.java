// Time Complexity : O(N), go through all elements to find the product
// Space Complexity : O(1), no additional space used
// Did this code successfully run on Leetcode : Yes
// Approach :

// We can keep prefix product at index i without including value at index i. So in the first pass, we can multiply values
// from left to right, where the product at [i] is of values at [i-1]. Similarly, we multiply values from right to left
// and multiply it with exiting product at [i];
public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] product = new int[size];

        int temp = 1;
        product[0] = temp;
        for(int i=1; i < size; i++){
            product[i] = temp * nums[i-1];
            temp *= nums[i-1];
        }

        temp = 1;
        for(int i= size-2; i >= 0; i--){
            product[i] = product[i] * temp * nums[i+1];
            temp *= nums[i+1];
        }

        return product;
    }
}
