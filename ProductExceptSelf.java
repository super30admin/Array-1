// Time Complexity : n^3
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        int leftProduct = 1;
        int rightProduct = 1;
        for(int i = 0; i< nums.length ; i ++){
            
            if(i > 0){
                for(int j = i -1; j >= 0 ; j --){
                    int temp = nums[j];
                    leftProduct = leftProduct * temp;
                }
            } 
            
            
                for(int k = i + 1; k < nums.length ; k ++){
                    int temp2 = nums[k];
                    rightProduct = rightProduct * temp2;
                }
            
            
            arr[i] = leftProduct * rightProduct;
            
            leftProduct = 1;
            rightProduct = 1;
        }
         return arr;
    }    
    }

    //-------------As Shown in class -----------------


    class Solution {
   
        public int[] productExceptSelf(int[] nums) {
            
          if(nums == null || nums.length == 0) return new int[0];
            
            int[] result = new int[nums.length];
            int leftProduct = 1;
            int rightProduct = 1;
            result[0] = leftProduct;
            for(int i = 1 ; i < nums.length ; i ++){
                    int temp = leftProduct;
                    leftProduct= nums[i-1] * temp;
                result[i] = leftProduct;
                
            }
            
            for(int k = nums.length - 2; k >= 0 ; k --){
                 int temp2 = result[k];
                rightProduct = rightProduct * nums[k + 1]; 
            
                    result[k] = temp2 * rightProduct;
                
            }
           
           
            return result;
        }   
    }