
public class ProductOfArrayExceptSelf {
    // Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

    public int[] productExceptSelf(int[] nums) {
        int[] productArray = new int[nums.length];
        productArray[0]=1;
        int rp = 1;
        for(int i=1;i<nums.length;i++) {
            rp = rp*nums[i-1];
            productArray[i] = rp;
        }
        rp = 1;
        for(int i=nums.length-2;i>=0;i--) {
            rp = rp * nums[i+1];
            productArray[i] = productArray[i] * rp;
        }
        return productArray;
    }
}
