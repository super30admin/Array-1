//Space complexity: o(1)
//Time complexity: o(n)
class Problem1 {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        result[0] = 1;
        int rp = 1;
        for(int i=1; i<n; i++){
            rp *= nums[i-1];
            result[i] = rp;
        }
        rp = 1;
        for(int j = n-2 ; j>=0; j--) {
            rp*=nums[j+1];
            result[j]=rp*result[j];
        }
        return result;
    }
}
