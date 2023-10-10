// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// The idea is to take running product of element
// The first loop starts from left to the element and starts storing rp in res array.
// The second loop then starts from right to left, it takes running product and at the same time manipulate rp with res[i]  

public class productOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int rp = 1;
        res[0] = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            rp = rp * nums[i];
            res[i + 1] = rp;
        }
        rp = 1;
        for (int i = nums.length - 1; i > 0; i--) {
            rp = rp * nums[i];
            res[i - 1] = rp * res[i - 1];
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
