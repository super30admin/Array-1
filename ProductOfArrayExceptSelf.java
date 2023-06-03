// Time Complexity : n(length of array)
// Space Complexity : n(used an additional array )
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english: Calculate left product and then the right product
// and then product the two results to find the final result


public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] product = new int[nums.length];

        // calculating left product

        product[0] = 1;

        for(int i = 1; i < nums.length; i++) {
            product[i] = product[i - 1] * nums[i - 1];
        }

        //calculating right product
        int rightProd = 1;
        for(int i = nums.length - 2; i >= 0; i--) {
            rightProd = rightProd * nums[i + 1];
            product[i]*= rightProd;

        }

        return product;


    }
}
