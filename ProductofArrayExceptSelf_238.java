// Time Complexity : O(n) => n = number of element
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class ProductofArrayExceptSelf_238 {
public int[] productExceptSelf(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return new int[0];
        }
        
        int n = nums.length;
        
        int[] pL= new int[n];
       
        int productLeft = 1;
        int productRight = 1;
        
        for(int i=0;i<n;i++){
            pL[i] = productLeft;
            productLeft *= nums[i];
        }
        
        for(int i=n-1;i>=0;i--){
            pL[i] = pL[i] * productRight;
            productRight *= nums[i];
        }
        
        
        return pL;
    }
}