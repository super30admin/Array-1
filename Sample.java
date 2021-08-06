// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes 
// Three line explanation of solution in plain english

Initially we cover the edge cases ,If there are is no array or no elements in an array we return empty array.We will store the elements in a result array. Firstly by traversing through the array from left to right to get the left product 
by using the running product and we store it in a result array. and then we calculate the right product by setting the running product to '1' and by traversing the array from the right side and multplying the elements to the running product and storing it a result array.
Finally , we return the result array. 

// Your code here along with comments explaining your approach:

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums ==null|| nums.length==0) // check if there is no array or it doesn't have any elements
        {
        return new int[]{}; // return an empty array
        }
      int[] result = new int[nums.length]; // Take the new result array
        int rp=1;  //Initliaze the rp product to 1.
         result[0] =1; //since there is no elements in the left side , we initiliaze the 1st element to 1.
        for(int i=1;i<nums.length;i++) // we traverse through the array from left to right.
        {
                rp = rp* nums[i-1];     // we multiply the running product to the elements in the array.
                result[i] = rp;        // we assign running product to result array.
    }
         rp =1;
        for(int i=nums.length-2;i>=0;i--) // we traverse through the array from the right side to left side
        {
           rp = rp* nums[i+1];            
            result[i] = result[i]* rp;    // multiply the running product with the result array
       
        }
        return result;   //return result array
    }
}
