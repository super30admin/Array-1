// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] product = new int[nums.length];
        // Arrays.fill(product,1);
        int right = 1;
        product[0]=1;
        for(int i=1;i<nums.length;i++){
            product[i]=product[i-1]*nums[i-1];
        }
        
        for(int i=nums.length-2;i>=0;i--){
            right=right*nums[i+1];
            product[i]=product[i]*right;
        }
        
        return product;
        
    }
}