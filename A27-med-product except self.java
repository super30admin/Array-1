// TC= O(n)
// SC= O(1)
// We never count space of input and output. Even if we are creating any new space, and if we are returning it, then we don't count it.

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n= nums.length;
        int left[]= new int[n];
        // System.out.println(n);
        int prod=1;
        left[0]=1;
        for(int i=1;i<n;i++)
        {
            // System.out.println(prod);
            prod *= nums[i-1];
            left[i]= prod;
        }

        prod=1;
        for(int j=n-2;j>=0;j--)
        {
            // System.out.println(prod);
            prod *= nums[j+1] ;
            left[j] =left[j]*prod;
        }

        return left;
    }
}