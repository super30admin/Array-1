// Time Complexity = O(n)
// Space Complexity = O(1) no auxilary space used, just the result array modified

// Approach
// 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int lengthArr = nums.length;
        int[] arr = new int[lengthArr];
        int rp = 1;
        //Left
        arr[0] = 1;
        for(int i=1;i<nums.length;i++){
            rp = rp*nums[i-1];
            arr[i] = rp;
        }
        rp = 1;
        for(int i=nums  .length-2;i>=0;i--){
            rp = rp*nums[i+1];
            arr[i] = rp * arr[i];
        }
        return arr;
    }
}