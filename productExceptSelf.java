//running product from left to right
//take single array to store left product and then take running product from right and keep storing
//Time complexity: O(n)
//Space complexity: O(n) 
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int rp=1;
        int n= nums.length;
        int[] result = new int [nums.length];
        result[0]=1;
        for(int i=1;i<n;i++) {
            rp = rp*nums[i-1];
            result[i] = rp;
        }
        rp=1;
        for(int i=n-2;i>=0;i--) {
            rp = rp*nums[i+1];
            result[i] = rp*result[i];
        }
        return result;
    }
}