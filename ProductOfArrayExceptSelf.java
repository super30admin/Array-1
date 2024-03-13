// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// traverse nums and keep multiplying all the numbers except self (current index element) and store it in a new array
// traverse from last to first now, but start from last-1 element.
// keep a variable runningProduct (rp) as 1, now multiply rp with last element store it in rp also multiply rp with current element in leftproduct array.
// Now traverse to the begining of the array and keep repeating the same

// Your code here along with comments explaining your approach

class ProductOfArrayExceptSelf {

    // Time Complexity = O(n)
    // Space Complexity = O(1)
    public int[] productExceptSelf(int[] nums) {

        if(nums == null || nums.length == 0){
            return new int[]{1};
        }

        int n = nums.length;
        int runningProduct = 1;
        int[] result = new int[n];
        result[0] = 1;

        // calculate left product
        for(int i = 1; i < n; i++) {
            runningProduct = runningProduct * nums[i-1]; // runningProduct * previous element, will give prodict until previous  elements
            result[i] = runningProduct;
        }

        // calculate left product
        runningProduct = 1; // reset
        for(int i = n-2; i > -1; i--) {
            runningProduct = runningProduct * nums[i+1]; // rp * previous element
            result[i] = runningProduct * result[i]; // runningProduct * result of all left numbers multiplied
        }
        return result;
    }
}