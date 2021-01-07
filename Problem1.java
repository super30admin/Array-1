/**
 * Time complexity - O(n)
 * Space complexity - O(2n)
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {

        if(nums==null||nums.length==0)
            return new int[]{};
        if(nums.length==2)
            return new int[]{nums[1],nums[0]};

        //Maintain two arrays for left and right prods
        int leftProd[] = new int[nums.length];
        leftProd[0]=1;
        int rightProd[] = new int[nums.length];
        rightProd[nums.length-1]=1;
        int[] result = new int[nums.length];

        result[0]=1;
        for(int i=1; i<nums.length; i++)
        {
            result[i]=nums[i-1]*result[i-1];
        }

        int r=1;
        for(int i=nums.length-1; i>=0; i--)
        {
            result[i]*=r;
            r*=nums[i];
        }

        return result;
    }
}