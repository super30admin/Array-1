    /*  Explanation
    # Leetcode problem link : https://leetcode.com/problems/product-of-array-except-self/
    Time Complexity for operators : o(n) .. number of  elements in the matrix
    Extra Space Complexity for operators : o(1) .. List is the required return type.
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
# Your code here along with comments explaining your approach
        # Basic approach : Two for loops. Multiply except self and return result from new array.

        # Optimized approach same like basic approach: 
                              
            # 1. calcuate.
              2. Traverse thru the matrix one by one the break condition will be top must be less and equalt to bottom similarly left
                 if lesser and equal to right.
              3. Starting from left to right till the left reaches to the right. Add the elements till that point and then increment
                 the top.
              4. Move from top towards bottom till the top reaches to the bottom. Add the elements till that point and then 
                 decrement the right.
    */
    import java.util.*;
    public class productExceptSelf{
        public static void main(String args[]) {
                    int matrix[] = {1,2,3,4};
                    int arr[] = maxProfit(matrix);
                    for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                    }
                }
                
                            
            public static int[] maxProfit(int nums[]) {
                if(nums == null || nums.length==0)
                    return new int[0];
            
                int[] result = new int[nums.length];
                
                int product = 1;
                
                // left side multiplciation of an element
                
                for(int i=0;i<nums.length;i++){
                    result[i] = product;
                    product *= nums[i];
                }
                
                //calcualte right side multiplication and multiply in same array
                product = 1;
                for(int i=nums.length-1;i>=0;i--){
                    result[i] = result[i]* product;
                    product *= nums[i];
                }
                
                return result;
            }
    }