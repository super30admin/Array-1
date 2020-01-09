// Time Complexity : Two for Loops one ascending to length of array and one descending from length of array. So O(2n) and Asymtotically O(n)
// Space Complexity : O(1) - No Auxillary array used 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

import java.util.*;
class ProdOfArray {
    public int[] productExceptSelf(int[] nums) {
        int rp = 1;
        int buffer = 1;
        int[] prod_array = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++)
        { //calculate running sum from right to left and store it in product array
            prod_array[i] = rp*buffer;  
            buffer = nums[i];
            rp = prod_array[i];
        }
        rp = 1; buffer = 1;
        for(int i = nums.length - 1; i >= 0; i--)
        { //manipulate prod array computed from last for loop to save auxillary space
            rp = rp*buffer;             
            prod_array[i] *= rp;
            buffer = nums[i];      
        }
    return prod_array;   //return prod array as result
    }
}

//Main class

class Main
{
    public static void main(String[] args)
    {
    ProdOfArray obj = new ProdOfArray();
    int[] input = {1,2,3,4};
    System.out.print("Product of array except self for the input array" + Arrays.toString(input) + " is " +  Arrays.toString(obj.productExceptSelf(input)) + "\n"); //returns [24,12,8,6]
    }
}