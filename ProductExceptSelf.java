// Time Complexity : O(n) as we need to traverse the array to get the prefix/suffix product
// Space Complexity : O(n) as we are using auxiliary arrays to save the prefix/suffix product
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length < 1){
            return null;
        }

        //hold the left product
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] product = new int[nums.length];

        int leftProduct =1;
        for(int i =0; i< nums.length; i++){
            leftProduct = leftProduct * nums[i];
            left[i] = leftProduct;
        }

        int rightProduct = 1;
        for(int i = nums.length-1; i >= 0; i--){
            rightProduct = rightProduct * nums[i];
            right[i] = rightProduct;
        }

        for(int i =0; i< nums.length; i++){
            if(i == 0){
                product[i] = right[i+1];
            }else if(i == nums.length -1){
                product[i] = left[i-1];
            }else{
                product[i] = left[i-1] * right[i+1];
            }
        }
        return product;
    }
}