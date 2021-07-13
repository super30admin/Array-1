//Method 1:By using Extrs space

// Time Complexity :O(N)+O(N)+O(N)~O(N)
// Space Complexity :O(N)+O(N)~O(N)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english:Left Array calculate the left product and Right Array calculates the right product and the output array calculates the left * Right product

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        //TC:O(N)+O(N)+O(N)
        //SC:O(N)+O(N)
         if(nums.length<=1||nums==null) return nums;
         int []left=new int  [nums.length];
         int []right=new int [nums.length];
         int [] output=new int[nums.length];
         left[0]=1;right[nums.length-1]=1;
         for(int i=1;i<nums.length;i++){
             left[i]=left[i-1]*nums[i-1];
          }
           for(int i=nums.length-2;i>=0;i--){
             right[i]=right[i+1]*nums[i+1];

         }
         for(int i=0;i<nums.length;i++){
             output[i]=left[i]*right[i];
         }
         return output;
    }
}

//Method 2:Without using Auxillary Space

// Time Complexity :O(N)+O(N)~O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int right=1;
        if(nums.length<=1||nums==null) return nums;
        int [] output=new int[nums.length];
        output[0]=1;output[nums.length-1]=1;
        for(int i=1;i<nums.length;i++){
            output[i]=output[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right=right*nums[i+1];
            output[i]=output[i]*right;

        }

        return output;
    }
}