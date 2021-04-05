//Approach - Calculate the product of all elements on left side and calculate the product of all elements on right side, finally multiply these 2 prouducts

//in one pass - calculate the right side product and store it in the result array.
//in another loop - calculate the product of left side elements * product of the right side elements, and store it in result array

//Time Complexity - O(N) - one pass through the nums array
//Space Complexity - O(1) exluding the result int[]

class Solution {
  public int[] productExceptSelf(int[] nums) {

    int n= nums.length;
    int[] result = new int[n];

    result[n-1] = 1;

    for(int i=n-2; i>=0; i--){
      result[i] = result[i+1] * nums[i+1];
    }
    int product =1;

    for(int i=1; i<n; i++){
      product = product*nums[i-1];
      result[i] = product * result[i];
    }

    return result;
  }
}
