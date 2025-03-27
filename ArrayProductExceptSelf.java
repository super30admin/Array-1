//Another approach for optimizing the space complexity
// TC: O(n)
// SC: O(n) or O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        // int[] right = new int[n];
        // int[] left = new int[n];

        int rp = 1;
        result[0] = 1;

        for(int i = 1; i<n; i++){
            rp = rp * nums[i-1];
            result[i] = rp;
        }

        rp = 1;
        // right[n-1] = 1;

        for(int i = n-2; i>=0; i--){
            rp = rp * nums[i+1];
            result[i] = result[i]*rp;
        }

        return result;

    }
}

//TC: O(2n) SC : O(2n)
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int[] right = new int[n];
//         int[] left = new int[n];

//         int rp = 1;
//         left[0] = 1;

//         for(int i = 1; i<n; i++){
//             rp = rp * nums[i-1];
//             left[i] = rp;
//         }

//         rp = 1;
//         right[n-1] = 1;

//         for(int i = n-2; i>=0; i--){
//             rp = rp * nums[i+1];
//             right[i] = rp;
//         }

//         for(int i = 0; i<n; i++){
//            result[i] = left[i] * right[i];
//         }

//         return result;

//     }
// }