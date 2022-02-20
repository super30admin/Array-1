class Solution {

  // space complexity - o(1)
      //time - o(3n)
      //Ran on Leetcode successfully : Yes
      // Problem faced  : No
      //Approach : store prefix product in out put array, modify input array to store suffix product, see the pattern
      // for the current i, product of prefix array -1 cell and suffix arry +1 cell, handle i =0  and end case seperately
  public int[] productExceptSelf(int[] nums) {

        int[] out = new int[nums.length];
        out[0] = nums[0];

        for(int i = 1; i<nums.length; i++){
            out[i]= out[i-1] * nums[i];
        }

        for(int i = nums.length-2; i>=0; i--){
             nums[i]=  nums[i] * nums[i+1];
        }

        for(int i = nums.length-1; i>=0; i--){

            if(i == 0){
               out[i] = 1 * nums[i+1];
            }
            else if( i == nums.length -1 ){
                out[i] = 1 * out[i-1];
            }
            else{
             out[i] = out[i-1] * nums[i+1];
            }
        }
        return out;

    }


  // same as above approach, instead of modifying the input array, we are storing the suffix product in a running variable
    public int[] productExceptSelf(int[] nums) {

        int[] output = new int[nums.length];
        output[0] = 1;

        for(int i = 1 ; i <nums.length; i++){
            output[i] = output[i-1] * nums[i-1];
        }

        int x = 1;

        for(int i=nums.length-1; i >= 0; i--){
            output[i] = output[i] * x;
            x = x * nums[i];
        }
        return output;
    }
}
