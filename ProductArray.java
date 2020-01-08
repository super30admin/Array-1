class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int temp=1;
        int rp=1;
        for(int i=0;i<nums.length;i++)
        {
            rp=temp*rp;
            result[i]=rp;
            temp=nums[i];
        }
        rp=1;
        temp=1;
        for(int j=nums.length-1;j>=0;j--)
        {
            rp=temp*rp;
            result[j]*=rp;
            temp=nums[j]; 
        }
        return result;    
    }
}