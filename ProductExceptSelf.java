// brute force : using nested iteration traverse entire arr for each index
// firstly in single pass we can find left product and then right product
// in second pass we can multiply both left and right product
// we use single resultant array to optimise space

// Time : O(n)
// Space : O(1) (excluding output array)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n];

        int rp = 1; // when we dont need extra data structure
        result[0] = 1;

        for(int i=1; i<n; i++){ // left pass
            rp = rp * nums[i-1];
            result[i] = rp;
        }
        rp = 1;

        for(int i=n-2; i>=0; i--) { // right pass
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }

        
        return result;
    }
}