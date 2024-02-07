class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []result = new int[nums.length];
        // Bruteforce
        //Time Complexity : O(n2)
       /* int product;
        for(int i =0; i<nums.length;i++) {
            product = 1;
            for(int j =0; j<nums.length;j++) {
                if(i!=j) {
                   product = product*nums[j];
                }
            }
            result[i] = product;
        }
        return result;*/
        result[0] = 1;
        int runningProduct = 1;
        for(int i =1; i<nums.length;i++) {
            runningProduct = runningProduct*nums[i-1];
           result[i] = runningProduct;
        } 
      int runningProduct2 = 1;
        for(int i = nums.length-1;i>=0;i--)  {
            result[i] = runningProduct2*result[i];
            runningProduct2= runningProduct2*nums[i];
           
        }
        return result;
    }
}