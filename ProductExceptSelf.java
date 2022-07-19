// Time Complexity : O(2n) -> O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        //base case
        if(nums.length == 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n];

        int rp = 1;
        result[0] = 1;

        for(int i=1; i<n; i++){
            //running product of left elements
            rp = rp * nums[i-1];
            //assign the result as running product of left elements
            result[i] = rp;
        }

        rp=1;
        for(int i=n-2; i>=0; i--){
            //running product of right elements
            rp = rp * nums[i+1];

            //running of left and right elements give the result
            result[i] = result[i] * rp;
        }

        return result;
    }
}