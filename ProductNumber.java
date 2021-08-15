
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
/*Approach
1) create an answer array and multiply it with the elements in number array with a runnning product
2) once that has been done, reset the running product and then iterate in reverse direction and calculate the product
3) this will let the result array store the multiplication of running product and the nums[i+1] in array.
*/
class Solution {
    public int[] productExceptSelf(int[] nums) {


        if(nums==null || nums.length==0)
        {
            return new int[]{};
        }

        int res[] = new int[nums.length];

        int runProduct =1;

        res[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            runProduct*=nums[i-1];
            res[i]=runProduct;

        }

        runProduct=1;


        runProduct =1;
        for(int i=nums.length-2;i>=0;i--)
        {
            runProduct*=nums[i+1];
            res[i]*=runProduct;
        }

        return res;
    }
}