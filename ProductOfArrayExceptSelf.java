/*Time Complexity : O(n) 
 Space Complexity : O(1)
  */


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int [nums.length];
        leftProduct[0]=1;
        for(int i=1;i<leftProduct.length;i++){
            leftProduct[i]=leftProduct[i-1]*nums[i-1];
        }

        int prevRightProduct = 1;
        for(int i=nums.length-2;i>=0;i--){
            int currRightProduct=prevRightProduct*nums[i+1];
            prevRightProduct=currRightProduct;
            leftProduct[i]=leftProduct[i]*currRightProduct;
        }

        return leftProduct;
    }
}