// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //Approach is to find left product and right product
        //Example arr[10,2,3,4]
        //Left product : To do left product add 1 to the left of the current array
                        //[1,10,2,3,4] 
                        //There is nothing left of one so ignore
                        //Now go to 10 and the left product is 1 
                        //Now to to 2 and the left produc is 10  
                        //Now go to 3 and left product is 20, go to 4 and left product is 60
    	//The pattern you see the product of self is value from the previous index of arr * input nums previous index
                        //[1,10,20,60]

        //Right Product: Initially add 1 to right [10,2,3,4,1]
                        //so for 4 it is 1
                         // for 3 right product is 4
                        //for 2 its 12
                        //for 10 its 24
                         //  [24,12,4,1]
        
        //result is left * right [24,120,80,60]
        
        //use the same right array to multiply and store result to reduce one auxiliary space
        
        if(nums == null || nums.length ==0)
            return new int[0];
        
        int [] left = new int[nums.length];
        int [] right = new int[nums.length];
        
        //left product
        left[0]=1;
        
        for(int i = 1; i < nums.length; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        
        //right product
        right[nums.length-1] =1;
        
        for(int i = nums.length-2; i >= 0; i--){
            right[i]= right[i+1]*nums[i+1];
        }
        
        //left * right
        
        for(int i =0; i < nums.length; i++){
            right[i] = right[i]* left[i];
        }
       return right; 
        
    }
}