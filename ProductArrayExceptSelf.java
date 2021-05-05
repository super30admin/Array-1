// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
/*
 Three line explanation of solution in plain english

  We do a two pass solution.In the first pass we set value at each index the running
  left product before it.In second pass we loop from right to left and we set value at
  each index the right runing product before it
*/

class ProductArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        //array for result
        int[] res = new int[nums.length];
        //initializing res[0] with num[0]
        res[0]=nums[0];
        //initializing left running product to 1
        int leftProd = 1;
        //initializing res[0] to 1 since we don' t have any number left to it.
        res[0]=1;
        //looping from left to right
        for(int i=1; i<nums.length; i++){
            //set res as the left running product
            res[i]=leftProd*nums[i-1];
            //update left running product
            leftProd = res[i];
        }

        // initializing right running product
        int rightProd =nums[nums.length-1];
        //looping from right to left
        for(int i=nums.length-2; i>=0; i--){
            // set res as product of cuurent result and right running product
            res[i]=rightProd*res[i];
            //update right running product
            rightProd = rightProd*nums[i];
        }
        return res;
    }
}