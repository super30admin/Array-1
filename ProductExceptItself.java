// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : calculate left products and right products. multiply both arrays to return the result

public class ProductExceptItself {
    public int[] productExceptSelf(int[] nums) {
        
        int[] leftProducts = new int[nums.length];
        int[] rightProducts = new int[nums.length];

        int[] result = new int[nums.length];

        leftProducts[0] = 1;
        rightProducts[nums.length - 1] = 1;

        for(int i=1; i< nums.length; i++) {
            leftProducts[i] = nums[i-1] * leftProducts[i-1];
        }

        for(int i=nums.length - 2; i >=0; i--) {
            rightProducts[i] = nums[i+1] * rightProducts[i+1];
        }

        for(int i=0; i< nums.length; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
  
    }
}