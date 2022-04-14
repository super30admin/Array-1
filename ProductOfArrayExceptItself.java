import java.util.Arrays;

/**
 * Time complexity is O(n)
 * Space complexity is O(1)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 */
public class ProductOfArrayExceptItself {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[] {-1,1,0,-3,3})));
    }

    private static int[] productExceptSelf(int[] nums) {
        //base case
        if(nums == null || nums.length == 0){
            return new int[] {};
        }

        int n = nums.length;
        int[] left = new int[n];
        int rp = 1;
        left[0] = 1;

        for(int i=1; i<n; i++){
            rp = rp * nums[i-1];
            left[i] = rp;
        }

        rp = 1;

        for(int i = n-2; i>=0; i--){
            rp = rp * nums[i+1];
            left[i] = left[i] * rp;
        }

        return left;
    }
}
