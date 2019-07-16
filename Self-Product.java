class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int temp =1;
        
        //product of left side
        for(int i =0; i<nums.length; i++)
        {
            result[i] = temp;
            temp*= nums[i];

        }
        
        temp = 1;
        //product of right side
        
        for(int i = nums.length-1; i>=0; i--)
        {
            result[i]*=temp;
            temp*=nums[i];
        }
        
        return result;
    }
}
