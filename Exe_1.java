class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] o = new int[n];
         int pf = 1;
        for(int i = 0; i<n; ++i){
            o[i] = pf;
            pf *= nums[i];
        }
         int sf = 1;
        for(int i = n-1; i>=0; --i){
            o[i] *= sf;
            sf *= nums[i];
        }
        return o;
    }
}
//tc=O(n)
//sc=O(1)
