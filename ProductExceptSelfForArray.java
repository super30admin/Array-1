//TC O(n)
//SC O(n)
// ans is multiply of prefix and suffix.
//works in leetcode
class ProductExceptSelfForArray {

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];

        int prefixProduct =1;
        int suffixProduct =1;

        for(int i=0;i<n;i++){
            out[i] = prefixProduct;
            prefixProduct = prefixProduct * nums[i];
        }
        for(int i=n-1;i>=0;i--){
            out[i] *= suffixProduct; // out array already has prefix, so multiply suffix to get final out
            suffixProduct = suffixProduct * nums[i];

        }
        return out;
    }



    public static void main(String [] args){
        int [] nums = {1,2,3,4};
        int [] nums1 = {-1,1,0,-3,3};
        int [] out = productExceptSelf(nums);
        for(int i=0;i< out.length;i++)
            System.out.println(out[i]);

    }
}