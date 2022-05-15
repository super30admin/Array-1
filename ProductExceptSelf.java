// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english
// Calculate the running product on the left and right side of the element

// Your code here along with comments explaining your approach

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] answer = new int[n];
        int runningProduct = 1;
        if (nums == null || n == 0) return answer;
        answer[0] = 1;
        for(int i=1; i<n; i++){
            runningProduct *= nums[i-1];
            answer[i] = runningProduct;
        }
        runningProduct = 1;
        for(int j=n-2; j>=0; j--) {
            runningProduct *= nums[j+1];
            answer[j] *= runningProduct;
        }
        return answer;
    }
}