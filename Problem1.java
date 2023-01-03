public class Problem1 {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] productArray = new int[n];
        int product = 1;

        productArray[0] = 1;
        productArray[n-1] = 1;

        //right product
        for(int i=1; i<n; i++){
            product *= nums[i-1];
            productArray[i] = product;
        }
        product = 1;
        //left product
        for(int i= n-2; i > -1; i--){
            product *= nums[i+1];
            productArray[i] *= product;
        }

        return productArray;

    }
}
