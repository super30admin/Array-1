package leetcode;
//time complexity =O(n)
//space complexity=O(1)

class Faang26 {
    public int[] productExceptSelf(int[] nums) {
        int[] result =new int[nums.length];
        if(nums==null||nums.length==0) return result;
        int rp=1; result[0]=1;
        //left product
        for(int i=1;i<nums.length;i++){
            rp=nums[i-1]*rp;
            result[i]=rp;
        }
        rp=1;
        for(int i=nums.length-2;i>=0;i--){
            rp=nums[i+1]*rp;
            result[i]=rp*result[i];
        }
        return result;
    }
}