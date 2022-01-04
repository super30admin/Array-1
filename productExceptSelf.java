Time Complexity : O(n);
Space Complexity : O(1);

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];

        int lp=1;
        int rp=1;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                left[0]=1;
            }
            else{
                rp=rp*nums[i-1];
                left[i]=rp;
            }
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            rp=rp*nums[i+1];
            left[i]=rp*left[i];
        }
        return left;
    }

}