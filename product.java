
 //Time Complexity (TC): O(n) — Three separate O(n) loops 
//space Complexity (SC): O(n) — Extra space for left[] and right[] arrays.

//Create two arrays: `left[]` to store the product of all elements to the left of each index, and `right[]` for the product of all elements to the right.
//Compute `left[]` by multiplying elements from left to right, and `right[]` by multiplying from right to left.
//Multiply corresponding elements of `left[]` and `right[]` to get the final `result[]` where each position holds the product of all elements except itself.


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n= nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];

        left[0] = 1;
        for(int i = 1; i<n; i++)
        {
            left[i] = left[i-1]*nums[i-1];
        }

        right[n-1] = 1;
        for(int i =n-2; i>=0; i--)
        {
            right[i] =  right[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++)
        {
            result[i] = left[i]*right[i];
        }

        return result;
    }
}