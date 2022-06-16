// Time complexity: O(n)
// Space Complexity: O(1)

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[nums.length];
        int rp = 1;
        result[0] = 1;
        for(int i = 1; i < nums.length; i++){
            rp *= nums[i-1];
            result[i] = rp;
        }
        rp = 1;

        for(int i = n-2; i>= 0; i--){
            rp *= nums[i + 1];
            result[i] *= rp;
        }
        return result;
    }
}
