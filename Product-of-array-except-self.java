class Solution {
    //Space complexity O(2n)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];
        //left
        int rp= 1;
        left[0] = rp;
        for(int i=1;i<n;i++){
            left[i] = nums[i-1]*rp;
            rp = left[i];
        }
        //right
        rp=1;
        right[n-1]=rp;
        for(int i=n-2;i>=0;i--){
            right[i]=nums[i+1]*rp;
            rp = right[i];
        }

        //result
        for(int i=0;i<n;i++){
            res[i] = left[i] * right[i];
        }
        return res;
    }
}