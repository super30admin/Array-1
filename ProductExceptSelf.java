// Time Complexity : O(2n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
import java.util.Arrays;

public class ProductExceptSelf {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        int right_prd = 1;
        answer[n-1] = 1;
        for(int i = n-2; i >= 0; i--) {
            right_prd *= nums[i + 1];
            answer[i] = right_prd;
        }

        int left_prd = 1;
        for(int i = 1; i < n; i++) {
            left_prd *= nums[i - 1];
            answer[i] *= left_prd;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
