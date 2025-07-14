
//TC: O(n) where n is the length of the array
//SC: O(1)
//Implemented using a new array and caluculate the product of the left side and push them to array
// then to same array multiply with the product of the right side
class ArrayProduct {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new int[] {};
        }
        int n = nums.length;
        int rp = 1;
        int[] ans = new int[n];
        ans[0] = rp;
        for(int i = 1; i< n; i++) {
            rp *= nums[i-1];
            ans[i] = rp;
        }
        rp = 1;
        for(int i = n-2; i>= 0; i--) {
            rp *= nums[i+1];
            ans[i] *= rp;
        }
        return ans;

    }
}
