//Time complexity: O(n)
//Space complexity: O(n)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]prefix=new int[n];
        int[]postfix=new int[n];
        prefix[0]=1;
        postfix[n-1]=1;
        for(int i=1;i<n;i++)
        {
            prefix[i] = nums[i-1]*prefix[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            postfix[i] = postfix[i+1]*nums[i+1];
        }
        int output[]=new int[n];
        for(int i=0;i<n;i++)
        {
            output[i]= prefix[i]*postfix[i];
        }
        
         return output;   
    }
}