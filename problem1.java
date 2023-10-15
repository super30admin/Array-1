//time complexity-o(n)
//space complexity-o(1)
//passed all test cases on leetcode 
// the approach is that we will first store the left side product and then the right side product for each element and multiply them to get the output.
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int product = 1;
        arr[0] = 1;
        for (int i = 1; i < n; i++) {
            product *= nums[i - 1];
            arr[i] = product;
        }
        product = 1;
        for (int i = n - 2; i > 0; i--) {
            product *= nums[i + 1];
            arr[i] = product * arr[i];
        }
        arr[0] = product * nums[1];
        return arr;
    }
}
