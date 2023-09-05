class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0) return new int []{0,0};
        int n = nums.length;
        int [] left = new int [n];
        int [] right = new int [n];
        int rProd = 1;
       

       //left
        left[0] = 1;
       for(int i=1; i<n; i++){
          left[i] = left[i-1] * nums[i-1];
       }

       for(int i= n-2; i>=0; i--){
           rProd *= nums[i+1];
           left[i] = rProd * left[i];
       }


       
       return left;
    }
}


/**

TC : O(n)
SC : O(1) --> There is no Auxilary DS which is used for caliculation, we are returing left array so not considering. 

Description : Not creating a new array for running products for right. Calculating right running product in the same left array.
Returning the same array as output. So no extra space.







 */