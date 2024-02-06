//SC: O(1)
//TC: O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        int product=1;
        int product_2=1;

        for(int i=0;i<nums.length;i++)
        {
            result[i]=product;
            product=product*nums[i];

        }
        for(int j=nums.length-1;j>=0;j--)
        {
            result[j]=result[j]*product_2;
            product_2=product_2*nums[j];

        }

        return result;
    }
}