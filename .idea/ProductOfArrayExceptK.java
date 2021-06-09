public class ProductOfArrayExceptK {
    public int[] productExceptSelf(int[] nums) {
        int [] result = new int[nums.length];
        if(nums==null || nums.length==0)
            return result;
        int rp =1;
        result[0]=1;
        //left pass
        for(int i=1;i<nums.length;i++)
        {
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp=1;
        for(int i=nums.length-2;i>=0;i--)
        {
            rp = rp * nums[i+1];
            result[i] = result[i] * rp;
        }
        return result;
    }
}

//Space is O(1).
//Time is O(N)
