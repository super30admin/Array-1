// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
// 1. Take suffix and prefix array, iterate through nums and populate suffix and prefix array with product till that index 
// 2. Initialize result[0] = suffix[1] and result[n-1] = prefix[n-2]
// 3. Iterate in O(n) over the nums array => result[i] = prefix[i-1] * suffix[i+1]

// Your code here along with comments explaining your approach

class Problem1 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        prefix[0] = nums[0];
        suffix[n - 1] = nums[n - 1];
        for (int i = 1, j = n - 2; i < n || j >= 0; i++, j--) {
            prefix[i] = prefix[i - 1] * nums[i];
            suffix[j] = suffix[j + 1] * nums[j];
        }
        // System.out.println("Prefix: " + prefix[0]);
        // System.out.print("Suffix: " + suffix[0]);
        result[0] = suffix[1];
        result[n - 1] = prefix[n - 2];
        for (int x = 1; x < n - 1; x++) {
            result[x] = prefix[x - 1] * suffix[x + 1];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] product = productExceptSelf(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(product[i] + " ");
        }
    }
}