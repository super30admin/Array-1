//Time complexity: O(n) n = length of nums
//Space Complexity: O(1)
//it runs successfully on leetcode
// I dont face any problems


public class ProductOfArrayExceptSelf238LeetCode {

    public int[] productExceptSelf(int[] nums) {

        int[] out = new int[nums.length];                       //creating the output array
//         out[0] = 1;
//         for(int i=1; i<nums.length; i++){
//             out[i] = out[i-1] * nums[i-1];
//         }

        //calculating prefix
        int prefixProduct = 1;
        for(int i=0;i<nums.length;i++){
            out[i] = prefixProduct;                         //assigning prefix to its respective position
            prefixProduct = prefixProduct * nums[i];        //update the prefixProduct value
        }


        int suffixProduct = 1;
        for(int i=nums.length-1; i>=0; i--){
            out[i] = out[i] * suffixProduct;                //multiplying current output element to suffixProduct to get output
            suffixProduct = suffixProduct * nums[i];        //update the suffixProduct
        }
        return out;

    }
}
