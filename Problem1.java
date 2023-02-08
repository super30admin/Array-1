/*
time: O(n)
space: O(1)
 */
public class Problem1 {
    static int[] product(int[] nums){

        int[] dp = new int[nums.length];
        int product = 1;

        dp[0] = nums[0];
        for (int i=1;i<nums.length; i++) {
            dp[i] = product*nums[i-1];
            product*= nums[i-1];
        }
        product = 1;

        for (int j=dp.length-1;j>=0;j--) {
            dp[j] = dp[j]*product;
            product*=nums[j];
        }

        return dp;
    }

    public static void main(String []args) {
        System.out.println(product(new int[]{1,2,3,4,5}));
    }
}
