// Time Complexity:  O(n) since we are traversing length of the array once at a time.
// Space Complexity: O(1) 

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;                 // variable holds running product
        int[] result = new int[nums.length];
        result[0] = rp;

        // Loop to get product of left elements of an index
        for(int i=1; i<result.length; i++){      
            rp = rp * nums[i-1]; 
            result[i] = rp;
        }

        // reseting running product variable
         rp = 1;
        

        // mutating result array to include product of right elements of an index
        for(int i=result.length-1; i>=0 ; i--){  
            result[i] = result[i] * rp;
            rp = rp * nums[i];
        }
        
        return result;
        
    }
}