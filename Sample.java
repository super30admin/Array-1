//****PRODUCT OF ARRAY EXCEPT SELF****
// Time Complexity : O(n);
// Space Complexity :O(1);
// Did this code successfully run on Leetcode : y
// Three line explanation of solution in plain english
//Basicaly we need to insert product of all left numbers and right numbers at ith postion so what we can do is maintain 2 arrays for which in first it will include the left
//running products and other from right which would include right running products. now inseated of mainiating 2 idfferent array and increasing the space complexity we 
//can do that using one array only and for econd array we will multiply in the existing array itself.

// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[] result= new int[n];
        
        result[0]=1;
        int rp=1;
        
        //left pass
        for(int i=1;i<n;i++)
        {
            rp= rp*nums[i-1];
            result[i]=rp;
        }
        rp=1;
        //right pass
        for(int i=n-2;i>=0;i--)
        {
            rp =rp*nums[i+1];
            result[i] *= rp;
        }
        return result;
    }
}
