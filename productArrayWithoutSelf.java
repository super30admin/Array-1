// Time Complexity : O(n) where n is the length of nums array
// Space Complexity : O(n) where n is the length of nums array
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Calculate 2 arrays which have products of left and
// right numbers respectively excluding the current number. Then multiply both arrays to obtain final answer

// Your code here along with comments explaining your approach

class productArrayWithoutSelf {
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n]; // product of all nums to the left of current num
        int[] right = new int[n]; // product of all nums to the right of current num
        left[0] = 1; // edge cases
        right[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            left[i] = left[i-1] * nums[i-1];
            right[n-i-1] = right[n-i] * nums[n-i];
        }
        int[] ans = new int[n]; // final answer is obtained by multiplying the left and right arrays
        for (int i = 0; i < n; i++) {
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4};
    	int[] ans = productExceptSelf(nums);
    	for (int i : ans) {
    		System.out.print(i + " ");
    	}
    }
}