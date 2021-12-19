//time O(n)
//space O(n)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftArr = new int[nums.length];
        int[] rightArr = new int[nums.length];
        int[] res = new int[nums.length];
        
        int product = 1;
        for(int i=0;i<nums.length; i++) {
            if(i==0) {
                leftArr[i] = product;
            } else {
                product = product * nums[i-1];
                leftArr[i] = product;
            }   
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--) {
            if(i==nums.length-1) {
                rightArr[i] = product;
            } else {
                product = product * nums[i+1];
                rightArr[i] = product;
            }
            
        }
        
        for(int i=0; i<nums.length;i++) {
            res[i] = leftArr[i]*rightArr[i];
        }
        return res;
        
    }
}