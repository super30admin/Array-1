//Time Complexity: O(N)
//Space Complexity:O(1)
//In this problem,first I'll declare the output array. After that I'll iterate through the array and compute the left product except the particular index which is in the current iteration. After that the a variable r indicating the rightmost element. The array is the iterated from right to left and then r is multiplied with the corresponding element in the out array. After that at the end of each iteration, r value is updated by multiplyting the current value of r with that in the nums array.
//This code was successfully executed and got accepted in leetcode.


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        out[0]=1;
        for(int i=1;i<nums.length;i++){
            out[i]=out[i-1]*nums[i-1];
        }
        int r=1;
        for(int i=nums.length-1;i>=0;i--){
            out[i]=out[i]*r;
            r*=nums[i];
        }
        return out;
    }
}