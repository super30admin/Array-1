package Array1;

/*
-------------------------------------------------------------------------------------------------------
    Time complexity :o(n)
    space complexity: o(1) 
    Did this code run successfully in leetcode : yes
    problems faces : no
*/
public class ProductOfArrayExceptItself {
    
    public int[] productExceptSelf(int[] nums)
    {
        int n = nums.length;
        int[] result = new int[n];
        if(nums == null || nums.length == 0 ) return nums;
        
        result[n-1] = 1;
        for(int i=n-2;i>=0;i--)
        {
            result[i] = result[i+1] * nums[i+1];
        }
        int rp = 1;
        for(int j=1;j<n;j++)
        {
            rp = rp * nums[j-1];
            result[j] = result[j] *rp;
        }
        
        
        return result;
    }

}
