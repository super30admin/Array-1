// Time Complexity : O(n)
// Space Complexity : O(1)
    // n is the length of the given array

// Your code here along with comments explaining your approach
    //We traverse the given array two times, left to right and right to left. 
    //In the first traversal, we also maintain a variable "mul=1". While iterating over the elements, we keep multiplying the current number with "mul", we store the "mul"s at the corresponding indexes of the answer array.
    //We do the same in our second traversal, but in the reverse Order. This time, We multiply the "mul"s with the corresponding numbers in the answer array.
    
class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int ans[] = new int[n];
        for (int i=0, mul=1 ; i<n; i++)
        {
            ans[i] = mul;
            mul *= nums[i];
        }
        for (int i=n-1, mul=1 ; i>=0; i--)
        {
            ans[i] *= mul;
            mul *= nums[i];
        }
        return ans;
    }
}