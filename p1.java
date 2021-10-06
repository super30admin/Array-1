class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        int n = nums.length;
        int[] op = new int[n];
        int productright = 1;
        int productleft = 1;
        for(int x = 0; x < n; x++){
            op[x] = productleft;
            productleft= productleft*nums[x];
        }

        for(int x = n - 1;x >= 0; x--){
            op[x] = op[x] * productright;
            productright = productright * nums[x];
        }return op;
    }
}