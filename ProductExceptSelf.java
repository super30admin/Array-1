// Time Complexity :O(2N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int[] result = new int[n]; 
        int[] left = new int[n];
        int[] right = new int[n];

        int rp=1;
        left[0]=1;

        for(int i=1; i<n; i++){ //left pass
            rp = rp * nums[i-1];
            left[i] = rp;
        }

        rp=1;
        right[n-1] = 1;

        for(int i=n-2; i>=0; i--) { //right pass
            rp = rp*nums[i+1];
            right[i]=rp;
        }

        for(int i=0; i<n; i++) {
            result[i] = left[i] * right[i];
        }

        return result;
    }
}