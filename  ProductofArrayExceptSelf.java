// Time Complexity : O(n); Running 2 loops to calculate prefix and then to multiply that with suffix elements
// Space Complexity : O(1) return the output array
// Did this code successfully run on Leetcode : Yes (https://leetcode.com/submissions/detail/642186364/)
// Any problem you faced while coding this : No
// My Notes : Calculate the prefix and then multiply it with suffix result

class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        // Intial dummy result as 1
        int result = 1;
        int arr[] = new int[nums.length];
        arr[0] = 1; // To make the initial element as 1 else it would multiply with the default 0
                    // value.
        // Calculating prefix of the arr from the 1 index
        for (int i = 1; i < nums.length; i++) {
            arr[i] = result * nums[i - 1];
            result = arr[i];
        }
        result = 1;
        // Calculating suffix of the arr from the last-1 index as last would be already
        // calculated
        for (int j = nums.length - 2; j >= 0; j--) {
            result = result * nums[j + 1];
            arr[j] = arr[j] * result;
        }
        return arr;

    }

    public static void main(String[] args) {

    }
}