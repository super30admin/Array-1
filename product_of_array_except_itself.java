class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        ans[0]=1;
        for(int i=1; i< nums.length;i++)
        {
            // Left side product
            ans[i] = nums[i-1]*ans[i-1];
        }
        int r =1;
        for(int i= nums.length-1; i>=0; i--)
        {
            //Left * Right
            ans[i] = ans[i]*r;
            // Update right side product
            r*=nums[i];
        }
        
        return ans;
    }
}

// TC- O(N) since all the elements in array are accessed 
// SC- O(1) if we assume the output array is alreadty given because of the function definition
/* Logic-
- We use two for loops to calculate left side and right side products for each 
of the elements.
- In order to increment the product (keep a track of all previous elements for left side, output array is used.
- For right side, we use a variable to store product since output array already has left side product
*/
