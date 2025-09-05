import java.util.Arrays;

//Time Complexity: O(sn) where s the amount and n is the number of coins
//Space Complexity: O(s) where we store the min coin required for [0, s] amount range
//Did this code successfully run on Leetcode : Yes

/**
 * Using dynamic programming approach to start calculating minimum coins required to get the amount [0, s].
 * We store the result into an array to avoid calculating the previously calculated results which gets our time complexity from O(s^n) to O(sn)
 */
public class ArrayProduct {

    int[] product(int[] nums) {
        int[] answer = new int[nums.length];
        answer[0] = 1;
        int lp = 1;
        for (int i = 1; i < nums.length; i++) {
            lp = lp * nums[i - 1];
            answer[i] = lp;
        }

        int rp = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            answer[i] = answer[i] * rp;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ArrayProduct().product(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(new ArrayProduct().product(new int[]{4, 2, 3, 1})));
    }
}
