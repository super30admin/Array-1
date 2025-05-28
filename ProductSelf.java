// Time Complexity = O(n);
// Space complexity = O(n);
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prev = 1;
        int temp = 1;
        for(int i=0; i<nums.length; i++){
            temp = temp * prev;
            result[i] = temp;
            prev = nums[i];
        }
        temp = 1; prev = 1;
        for(int j=nums.length-1; j>=0 ; j--){
            temp = temp * prev;
            result[j] = temp * result[j];
            prev = nums[j];
        }
         return result;
    }

    public static void main(){
        Solution sol = new Solution();
        int[] nums = [1,2,3,4];
        int[] result = sol.productExceptSelf(nums);
        system.out.print('Result : '+result);

        nums = [-1,1,0,-3,3];
        result = sol.productExceptSelf(nums);
        system.out.print('Result : '+result);
    }

   
}