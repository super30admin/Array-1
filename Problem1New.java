//TC : O(N)
//SC : O(N)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
      int len = nums.length;
      int[] leftPrd  = new int[len];
      int[] rightPrd = new int[len];
      int[] output = new int[len];  
        
      leftPrd[0] = 1;
      rightPrd[len-1] = 1;
      
      //computing the left product array
      for(int i =1; i<len;i++){
          leftPrd[i] = nums[i-1]*leftPrd[i-1];
      }  
      
      //computing the right product array
      for(int i=len-2;i>=0;i--){
          rightPrd[i] = nums[i+1]*rightPrd[i+1];
      }   
        
      for(int i =0; i<len;i++){ 
      output[i] =leftPrd[i]*rightPrd[i] ;
       }    
       return output; 
    }
}
