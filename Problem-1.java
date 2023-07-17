// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : ye
// Three line explanation of solution in plain english

//Solution: Using an additional Array to maintain running product
// First Pass: maintain running product in one direction.
// Second Pass: Calculate running product in reverse direction and multiple by 
// results of 1st pass in place
// Time : O(n)
// Space: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n];
        arr[0] = 1;
        int rp = 1;
        for(int i =1; i<n; i++) {
            arr[i] = nums[i-1] *rp;
            rp = nums[i-1] *rp;
        }

        int rp1 = 1;
        for(int i =n-2; i>=0; i--) {
            arr[i] = nums[i+1] *rp1 *arr[i];
            rp1 = nums[i+1] *rp1;
        }
        
        return arr;

    }
}

