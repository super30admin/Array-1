// TC = O(n) , n=no of elements in nums array
// SC = 2*O(n) = O(n) , since we are creating two auxiliary arrays
// left and right to store the product on left side and right side
import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        left[0] = 1;
        for(int idx=1;idx<n;idx++){
            left[idx]=nums[idx-1]*left[idx-1];
        }
        right[n-1] = 1;
        for(int idx=n-2;idx>=0;idx--){
            right[idx] = nums[idx+1]*right[idx+1];
        }
        for(int idx=0;idx<n;idx++){
            res[idx] = left[idx]*right[idx];
        }

        return res;

    }

    public static void main(String[] args) {
        int[] res = ProductExceptSelf.productExceptSelf(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(res));

    }
}
