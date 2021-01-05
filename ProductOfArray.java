
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] left = new int[nums.length-1];
        int[] right = new int[nums.length-1];
        left[0] = nums[0];
        for(int i=1; i<nums.length-1; i++){
            left[i] = left[i-1]*nums[i]; 
        }
        right[nums.length-2] = nums[nums.length-1];
        for(int i=right.length-2; i>=0; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        
        res[0] = right[0];
        res[res.length-1] = left[left.length-1];
        
        for(int i=1;i<res.length-1;i++){
            res[i] = left[i-1]*right[i];
        }
        return res;
    }
}

//Time complexity : O(N) where N is the number of elements
//Space complexity : O(N)
