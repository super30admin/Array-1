// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//created left array first 
//in the same left array created right with product of left of each number except self
//returning product array except self product of right and left


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []left=new int[nums.length];
        int product=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                product=1;
              }
            else{
               product= product*nums[i-1];
                }
            left[i]=product;
           
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--){
            if(i==nums.length-1){
                product=1;
                 
            }else{
                 product= product*nums[i+1];
            }
           
               
           
             left[i]=left[i]*product;
            
        }
        return left;
    }
}