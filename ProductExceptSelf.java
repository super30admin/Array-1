// Time Complexity :O(n)
// Space Complexity :O(1)
class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        if(nums==null || nums.length==0) return result;
        int rp=1;
        result[0]=1;
        for (int i=1;i<n;i++)
        {
            rp=rp* nums[i-1];
            result[i]= rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--)
        {
            rp*=nums[i+1];
            result[i]*=rp;
        }
        return result;
        
    }
}