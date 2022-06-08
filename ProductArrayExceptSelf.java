//Time complexity: O(n)
//Space complexity: O(1)

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        //create an array of the same size as nums which we will return
        int [] result = new int [n];
        
        //if nums is empty then return empty array
        if(nums == null || n == 0) return result;
        
        //setting the first element as 1
        result[0] = 1;
        
        //creating a left running product variable and setting the value to 1
        int RPfromLeft = 1;
        
        //left pass 
        //starting from the second element to the last
        //calculating the running product at each index and storing it in result array
        for (int i = 1; i < n; i++)
        {
            RPfromLeft = RPfromLeft * nums[i - 1];
            
            result[i] = RPfromLeft;
        }
        //Ex: nums = [1,2,3,4]
        //RPLeft values for each iteration of the loop 1 -> 1*1 -> 1*2 -> 2*3
        //therefore, result=[1,1,2,6]
        
        //creating a left running product variable and setting the value to 1
        int RPfromRight = 1; 
        
        //right pass
        //starting from the last to seccond element and move all the way to the first element
        //calcualting the running product and multiplying it to the element at that specific index
        for (int i = n - 2; i >= 0; i--)
        {
            RPfromRight = RPfromRight * nums[i + 1];
            //Ex: nums = [1,2,3,4]
            //RPRight values for each iteration of the loop...
            //12*2 <- 4*3 <- 1*4 <- 1 will be 24 <- 12 <- 4 <- 1
            //this time we start from the back
            
            //previously, result was [1,1,2,6]
            result[i] = result[i] * RPfromRight;
            //now, result = [1*24, 1*12, 2*4, 1*6]  
        }        
        //result = [24, 12, 8, 6]
        return result;
    }
}