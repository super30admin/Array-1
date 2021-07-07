//Time: O(n)
//Space: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int left=1, right=1;
        int[] res= new int[nums.length];
        res[0]=1;
        for(int i=1; i<nums.length; i++){
            
              left*=nums[i-1];
               res[i]=left;
          
            
        }
        
        for(int i=nums.length-2; i>=0; i--){
            
            right*=nums[i+1];
            res[i]*=right;
        }
        
        return res;
        
        
        
    }
}