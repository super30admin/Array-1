//TC: O(n)
//SC: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int rpL=1;
        int rpR =1;
        
        int result[] = new int[nums.length];
        
        result[0] = 1;
        
        //left to right pass
        
        for(int i=1; i< nums.length; i++){
            
            rpL = rpL * nums[i-1];            
            result[i] = rpL;            
            
        }
        
        
        //right to left pass
        for(int i=nums.length-1; i>=0; i--){
            if(i == nums.length-1){
                result[i] = result[i] * rpR;
                continue;
            }
            
            rpR = rpR * nums[i+1];
            result[i] = result[i] * rpR;
        }
        
        return result;
        
        
    }
}