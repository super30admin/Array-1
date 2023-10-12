package S30.exercises;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No

// Approach: loop through the  array from left calculate the product of all the numbers to left of the current number and
//add it to the results then loop through the array again from right and calculate the product of all the numbers behid it
// multiply with the element from the array and replace it with the result in the array.  Return result.
// store it in the results
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int rp = 1;
        int[] results = new int[n];
        results[0] = 1;
        for(int i =1; i<n; i++){  // left pass
            rp = rp * nums[i-1];
            results[i] = rp;
        }
        rp = 1;
        for(int i = n-2; i>=0; i--){  // right  pass
            rp = rp * nums[i+1];
            results[i] = results[i] * rp;
        }
        return results;
    }
}
