// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// get the left running product array by multiplying each previous element
// then go through the right running product
// Your code here along with comments explaining your approach
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] result = new int [n];
        if( nums == null || n == 0 ) return result;
        // left side multiplication
        int mul = 1;
        for( int i = 0; i < n; i ++){
            result[i] = mul;
            mul = mul * nums[i];
        }
        mul = 1;
        // right side multiplication
        for(int i = n-1 ; i>=0 ; i--){
            result[i] = result[i] * mul;
            mul = mul * nums[i];
        }
        return result;
    }
}


// 238. Product of Array Except Self - Medium -- other methiod buy not recomeded one ( old )
// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Get multiplication of all the array values, then replace each array value with the ( multiple / individual number)
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        if (nums == null || nums.length == 0){
//            return new int[0];
//        }
//        int mul = 1;
//        int mulWithOutZero = 1;
//        int moreThanOne = 0;
//        for(int i = 0; i< nums.length; i++){
//            if( nums[i] != 0){
//                mulWithOutZero = mulWithOutZero * nums[i];
//            }
//            if( nums[i] == 0){
//                moreThanOne++;
//            }
//            mul = mul * nums[i];
//        }
//        for(int i = 0; i< nums.length; i++){
//            if (nums[i] == 0 && moreThanOne <= 1){
//                nums [i] = mulWithOutZero;
//            }else if (nums[i] == 0 && moreThanOne > 1){
//                nums [i] = 0;
//            }
//            else{
//                nums[i] = mul / nums[i];
//            }
//        }
//        return nums;
//    }
//}