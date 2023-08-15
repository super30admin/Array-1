// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int product = 1;
        arr[0]=1;
        
        // caluculate left product of ech and every element ans store it in result array
        for (int i=1;i< nums.length;i++) {
            product *= nums[i-1];
            arr[i]=product;
        }

        product =1;

        for(int j=nums.length-2; j>=0;j--)  //now calculate the right product of each element from right most 
        {
            
            product *= nums[j+1];
            arr[j]*= product;
        }

        return arr;
    }
}