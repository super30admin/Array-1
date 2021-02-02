// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// we are calculating the product of elements to the left of each element beforehand and then we are just multiplying that product with the 
// product of elements to the right of each element 

// Your code here along with comments explaining your approach

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        
        int productright = 1;
        int productleft = 1;
        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i] = productleft * nums[i-1];
            productleft = left[i];
        }
        
        
        for(int i=nums.length-1;i>=0;i--){
            left[i]*= productright;
            productright *=nums[i];
        }
        return left;
    }
}
