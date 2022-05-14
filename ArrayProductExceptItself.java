// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
//First I'm creating a result array and story product array from left side
//Then Now I'm maintaing rProduct from right side and multipliying with result elements

public class ArrayProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int rProduct = 1;
        int[] res = new int[nums.length];
        res[0] = 1;
        for(int i=1; i< nums.length; i++){
            res[i] = res[i-1] * nums[i-1]; 
        }
        for(int i = nums.length -1; i>= 0; i--){
            res[i] = res[i] * rProduct;
            rProduct *= nums[i];
        }
        return res;
    }
    
}