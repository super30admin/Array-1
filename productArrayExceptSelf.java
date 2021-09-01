/*

Brute 
    O(n2)


Time : O(n)
Space = O(1)



*/





class Solution {
 
    /*
        public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
            int mul = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i == j) {
                    continue;
                }
                mul *= nums[j];
            }
            arr[i] = mul;
        }
        return arr;
    }
    
    */
        
         public int[] productExceptSelf(int[] nums) {
             int[] result = new int [nums.length];
             
             int lp = 1;
             result[0] = lp;
             
             for(int i= 1;i<nums.length;i++){
                 lp = lp*nums[i-1];
                 result[i] = lp;
                 
             }
             //System.out.println(result);
             
             lp = 1;
             
             for(int i = nums.length-2;i >= 0;i--){
                 lp = lp*nums[i + 1];
                 result[i] *= lp;
                 
             }
             
             
             
             
         return result;    
         }
        
    }
    
    
    