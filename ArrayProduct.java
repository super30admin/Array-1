public class ArrayProduct {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[]{};

        int[] left = new int[nums.length];
        left[0] = 1;

        int[] right = new int[nums.length];
        right[nums.length - 1] = 1;

        int rProduct = 1;

        for(int i = 1; i < nums.length; i++) {
            rProduct = rProduct * nums[i - 1];
            left[i] = rProduct;
        }

        rProduct = 1;
        for(int i = nums.length - 2; i >=0; i--) {
            rProduct = rProduct * nums[i + 1];
            right[i] = rProduct;
        }

        for(int i=0; i < right.length; i++){
            right[i] = left[i] * right[i];
        }

        return right;
    }

    public static void main(String[] args) {
        ArrayProduct arrayProduct = new ArrayProduct();
        int[] result = arrayProduct.productExceptSelf(new int[]{-1,1,0,-3,3});
        for(int element : result) {
            System.out.println("element = " + element);
        }
    }
}
