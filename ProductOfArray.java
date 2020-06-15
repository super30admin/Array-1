//Time complexity of bruteforce solution is O(n*n) and space complexity is O(1)
//Bruteforce solution
class Solution {
  public int[] productExceptSelf(int[] nums) {
    if(nums.length == 0)
      return new int[0];
    int[] result = new int[nums.length];
    for(int i=0;i<nums.length;i++){
      int prod = 1;
      for(int j=0;j<nums.length;j++){
        if(i != j){
          prod *= nums[j];
        }
      }
      result[i] = prod;
    }
    return result;
  }
}


//Time complexity of optimal solution is O(n + n) and space complexity is O(1)
//Optimal Solution

class Solution {
  public int[] productExceptSelf(int[] nums) {
    if(nums.length == 0)
      return new int[0];
    int prod = 1;
    int[] result = new int[nums.length];
    result[0] = 1;
    for(int i=1;i<nums.length;i++){
      prod *= nums[i-1];
      result[i] = prod;
    }
    prod = 1;
    for(int j=nums.length-2; j>=0;j--){
      prod *= nums[j+1];
      result[j] *= prod;
    }
    return result;
  }
}