//product of array except self
//Timecomplexity:o(n)
//spacecomplexity:o(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
  
        int[] left = new int[nums.length];
        left[0]=1;
        for(int i=1; i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        int maxRight =1;
        for(int i=nums.length-1;i>=0;i--){
            left[i]=maxRight*left[i];
            maxRight*=nums[i];
        }
        return left;
    }
}