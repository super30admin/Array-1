class Solution {
    //tc-o(n)
    //sc=o(1)
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[]arr=new int[n];
        int rp = 1;
        arr[0] = 1;
        for(int i=1;i<n;i++)
        {
            rp = rp*nums[i-1];
            arr[i] = rp;
            
        }
        rp = 1;
        for(int i=n-2;i>=0;i--)
        {
            
            rp = rp*nums[i+1];
            arr[i] = arr[i]*rp;
            
            
        }
        
        return arr;
        
    }
}