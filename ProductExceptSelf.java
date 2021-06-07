/*TC - O(N)  - linear iteration
 *SC - O (3N) = O (N) using 3 auxiliary arrays
 -ran on leetcode - yes
 * */

// Approach - construct an array with starting index containing one and keep on populating based on product of its previous and current , that way we are not considering the number itself , 
// simi;arly,  construct an array with last index containing one ,  and keep on populating based on product of its next and current, 
// finally , take produt of the two arrays to evaluate the product of corresponding elements
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] left = new int[nums.length];
        left[0] =  1;
        
        int[] right = new int[nums.length];
        right[nums.length-1] =  1;
        
        
        for (int i = 1; i <nums.length ; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        
        for (int i = nums.length-2; i >=0 ; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        
        int[] ans = new int[nums.length];
        
        for (int i = 0 ; i <nums.length; i++){
            ans[i] = left[i] * right[i];
        }
        return ans;
    }
}


