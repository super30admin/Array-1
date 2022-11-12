//time complexity is O(N)
//Space complexity is O(1);
//able to submit in leetcode
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int mul = 1;
        int z=0;
        int index =-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                mul= mul * nums[i];
            else{
                z=z+1;
                index=i;
            }
        }
        if(z>1)
        return result;
        else if(z==1){
            
            result[index]=mul;
            return result;
        }
        for(int i=0;i<nums.length;i++){
            result[i]=mul/nums[i];
        }
        return result;
    }
}