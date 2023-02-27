public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        result[0] = 1;
        int rp = 1;
        // left subarray
        for(int i=1;i<n;i++){
            rp = rp*nums[i-1];
            result[i] = rp;
        }

        rp = 1;
        for(int i=n-2;i>=0;i--){
            rp = rp*nums[i+1];
            result[i]*=rp;
        }
        return result;
    }
}

// TC - O(n)
// SC - O(1)
