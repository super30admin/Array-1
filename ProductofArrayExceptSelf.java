// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return new int[0];
        int [] result = new int[nums.length];
        int temp = 1; int rp = 1;
        // forward pass
        for (int i = 0; i < nums.length; i++) {
            rp = rp*temp; // new rp
            result[i] = rp;
            temp = nums[i];
        }
        temp = 1; rp = 1;
        for(int i = nums.length -1; i >=0; i--) {
            rp = rp*temp;
            result[i] = result[i]*rp;
            temp = nums[i];
        }
        return result;
    }
}
