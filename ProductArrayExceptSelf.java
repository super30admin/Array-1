// Time Complexity : Latest soln O(N) - Brute force -// O(N^2) - no of elements
// Space Complexity : O(N) - No of elements same for brute force
// Did this code successfully run on Leetcode :Yes,  for Brute force - Yes,but TLE
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         if(nums == null || nums.length == 0) return nums;
//         int[] output = new int[nums.length];
//         Arrays.fill(output, 1);
//         for(int i = 0 ;i<nums.length;i++){
//             for(int j = 0 ;j<nums.length;j++){
//                 if(i != j){
//                     output [j] *= nums[i];                 
//                 }
//             }
//         }
//         return output;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length == 0) return nums;
        int n = nums.length;
        int[] res = new int[n];
        int right=1,left=1;
        for(int i = 0;i < n; i++){
            res[i] = 1;
        }
    	for (int i = 0; i < n; i++) { // left sum - 
    		res[i] *= left;
    		left *= nums[i];
    	}
    	for(int i = n-1; i>=0; i--) { // right sum - 
    		res[i] *= right;
    		right *= nums[i];
    	}
        return res;
    }
}