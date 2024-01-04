//TC = O(n)
//SC = O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProduct = new int[n];
        int rightProduct = 1;
        leftProduct[0] = 1;
        for(int i = 1; i < n; i++)
        {
            leftProduct[i] = leftProduct[i-1]*nums[i-1];   
        }
        for(int i = n - 2; i >=0; i --)
        {
            rightProduct = rightProduct*nums[i+1];
            leftProduct[i] = leftProduct[i]*rightProduct;   
        }
        return leftProduct;    
    }
}