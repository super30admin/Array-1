class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]fd= new int[nums.length];
         
        int prod=1;
       
        
        
        
        for( int i=0;i<nums.length;i++){
            
            fd[i]=prod*nums[i];
            prod=prod*nums[i];
        }
      
        
        prod=1;
        
        
        for(int i=nums.length-1;i>=0;i--)
        {
           if(i==0){
               
               
               fd[i]=prod;
               
           }else{
               
               fd[i]=fd[i-1]*prod;
              
               prod=nums[i]*prod;
           }
            
            }
        
        
        return fd;
        
        
    }
}

// tc: O(n)
// SC:  Constant