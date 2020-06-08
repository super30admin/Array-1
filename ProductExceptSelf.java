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
