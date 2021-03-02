//Time Complexity: O(n)
//Space complexity: O(1) we are using output[] for result so it doesn't count;
//Executed on leetcode
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int []output = new int[n];
        int prod = 1;
        output[0] = 1;
       for(int i=1;i<n;i++)
       {
           output[i] = output[i-1]*nums[i-1];   //First loop is to get the product of numbers that are before the particular index
       }
        for(int i=n-2;i>=0;i--)             //second loop is to get the product of numbers that are after the particular index
       {
           prod = prod*nums[i+1];
            output[i] = output[i]*prod;         //at the end i mutiple before and after value of each index and return the number.
       }
        
        return output;
    }
}