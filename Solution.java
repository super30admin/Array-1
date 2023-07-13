//Product of array to self sum
//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {

        //take running product from left
        //multiply it with running product from right
        //return the ans

        int m=nums.length;
        int[] result=new int[m];
        //running product from left
        int rp=1;
        result[0]=1;
        for(int i=1;i<m;i++)
        {
            rp=rp*nums[i-1];
            result[i]=rp;
        }
        //running product from right
        rp=1;
        for(int i=m-2;i>=0;i--)
        {
            rp=rp*nums[i+1];
            result[i]=result[i]*rp;

        }

        return result;
    }
}